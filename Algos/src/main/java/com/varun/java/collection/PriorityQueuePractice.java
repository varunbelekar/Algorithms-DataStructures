package com.varun.java.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueuePractice {
	public static void main(String[] args) {
		//Queue of integers
		createQueueOfIntegers();
		
		//Queue of user-defined class
		//queueOfPatients();
	}

	private static void queueOfPatients() {
		Queue<Patient> patientsQueue = new PriorityQueue<>(Comparator.comparing(Patient::getCriticality));
		patientsQueue.add(new Patient("varun", 5));
		patientsQueue.add(new Patient("aru", 2));
		patientsQueue.add(new Patient("aakash", 1));
		
		System.out.println(patientsQueue);
	}

	private static void createQueueOfIntegers() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(6);
		queue.add(1);
		System.out.println(queue);
		
		System.out.println("Head of the queue: " + queue.peek());
		System.out.println("Reomoving the head : " + queue.poll());
		System.out.println(queue);
		
		//creating queue in descending order
		queue = new PriorityQueue<>(Comparator.comparing(Integer::intValue).reversed());
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(6);
		System.out.println(queue);
		
		System.out.println("Head of the queue: " + queue.peek());
		//System.out.println("Reomoving the head : " + queue.poll());
		
		//Iterating the queue
		queue.forEach(System.out::println);
	}
}

class Patient /*implements Comparable<Patient>*/{
	private String name;
	private Integer criticality;
	public Patient(String name, Integer criticality) {
		super();
		this.name = name;
		this.criticality = criticality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCriticality() {
		return criticality;
	}
	public void setCriticality(Integer criticality) {
		this.criticality = criticality;
	}
	/*@Override
	public int compareTo(Patient o) {
		if(this.getCriticality() > o.getCriticality()){
			return 1;
		}else{
			return -1;
		}
	}*/
	@Override
	public String toString() {
		return "Patient [name=" + name + ", criticality=" + criticality + "]";
	}
	
}
