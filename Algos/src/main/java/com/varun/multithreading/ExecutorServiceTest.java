package com.varun.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(8);
        //Task to run after 10 seconds delay
        scheduledPool.schedule(() -> 4, 10, TimeUnit.SECONDS);

        //Task to run repeatedly every 5 seconds
        scheduledPool.scheduleAtFixedRate(() -> System.out.println("4"), 10, 5, TimeUnit.SECONDS);

        //Task to run repeatedly 5 seconds after previous task completes
        scheduledPool.scheduleWithFixedDelay(() -> System.out.println("4"), 10, 5, TimeUnit.SECONDS);

        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(3000);
            return 5;
        });

        try {
            System.out.println(future.get(10, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }

    }
}
