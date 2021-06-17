package com.simple;

import java.util.HashSet;
import java.util.Set;

public class Setcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> str = new HashSet<>();
		str.add("veera");
		str.add("ram");
		str.add(123);
		str.add(45.5);
		
		for(Object name:str) {
			System.out.println(name);
		}
		HashSet<HashSet<Object>> has = new HashSet<>();
		
		Set<Object> str1 = new HashSet<>();
		str1.add("veera");
		str1.add("ram");
		str1.add("Suresh");
		str1.add("hiran");
		
		has.add((HashSet<Object>) str);
		has.add((HashSet<Object>) str1);
		
		for (HashSet<Object> ram:has) {
			if(ram.contains("hiran"))
				System.out.println("Yes");
		}
	}

}
