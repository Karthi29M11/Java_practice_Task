package com.index;

import java.util.TreeSet;

public class Task_18_1 {
	public static void main(String[] args) {
		TreeSet<String> milkshake = new TreeSet<>(); 
		milkshake.add("Stawberry");
		milkshake.add("Vanila");
		milkshake.add("Chocolate");
		milkshake.add("ButterScotch");
		milkshake.add("BlackCurrent");
		milkshake.add("Vanila");
		System.out.println(milkshake);
		System.out.println(milkshake.contains("Stawberry"));
		System.out.println(milkshake.ceiling("Chocolate"));
		System.out.println(milkshake.floor("Stawberry"));
		System.out.println(milkshake.higher("ButterScotch"));
		
		System.out.println(milkshake.lower("ButterScotch"));
		System.out.println(milkshake.pollFirst());
		System.out.println(milkshake.pollLast());
		milkshake.remove("BlackCurrent");
		TreeSet<String> Mojito = new TreeSet<>();
		Mojito.add("LimtMojito");
		Mojito.add("RaseBerry");
		Mojito.add("CherryMojito");
		Mojito.add("MangoMojito");
		Mojito.add("LimtMojito");		
		System.out.println(Mojito);
		System.out.println(Mojito.contains("RaseBerry"));
		System.out.println(Mojito.ceiling("LimtMojito"));
		System.out.println(Mojito.floor("RaseBerry"));
		System.out.println(Mojito.higher("CherryMojito"));
		System.out.println(Mojito.lower("CherryMojito"));
		Mojito.remove("RaseBerry");
		System.out.println(Mojito.pollFirst());
		System.out.println(Mojito.pollLast());
	
		
		
		
	}

}
