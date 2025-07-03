package com.index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Task_19_1 {
	public static void main(String[] args) {
		TreeSet<Integer> evenNumbers = new TreeSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		
		System.out.println("EvenNumbers : " +evenNumbers);
		
		evenNumbers.addAll(Arrays.asList(6,8,10,12));
		System.out.println("\nAdd EvenNumbers : "+evenNumbers);
		
		evenNumbers.clear();
		System.out.println(evenNumbers);
		
		HashSet<Integer> number = new HashSet<>();
		number.add(20);
		number.add(10);
		number.add(60);
		number.add(40);
		number.add(50);
		
		System.out.println("Number List : "+number);
		List<Integer> sortedList = new ArrayList<>(number);
		
		Collections.sort(sortedList);
		System.out.println("\nSorted List : "+sortedList);
		
	}

}
