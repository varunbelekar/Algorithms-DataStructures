package com.varun.enums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CoffeeTest {
    public static void main(String[] args) {
        List<CoffeeSize> coffeeSizes = new ArrayList<>();
        for (CoffeeSize coffeeSize : CoffeeSize.values()) {
            coffeeSizes.add(coffeeSize);
        }
        System.out.println(coffeeSizes);

        System.out.println("Sorting based on ounces");
        coffeeSizes.sort(Comparator.comparing(CoffeeSize::getOunce));
        System.out.println(coffeeSizes);

        System.out.println("Sorting based on label");
        coffeeSizes.sort(Comparator.comparing(CoffeeSize::getLabel));
        System.out.println(coffeeSizes);
    }
}
