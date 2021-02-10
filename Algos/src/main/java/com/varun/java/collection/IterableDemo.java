package com.varun.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		//Using for-each loop
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//Using forEach Method
		list.forEach(System.out::println);
		
		//Using iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
