package com.javapro;

import java.util.HashSet;
import java.util.Set;

public class Pairsinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {2,-3,4,3,5,-4};
		boolean flag = false;
		int totallength = number.length;
		Set<Integer> newset = new HashSet<>();
		for(int i=0;i<totallength;i++) {
			if(number[i]>0) {
				newset.add(number[i]);
			}
		}
		for(int j=0;j<totallength;j++) {
			if(number[j]<0) {
				if(newset.contains(-number[j])) {
					System.out.println(-number[j]+": "+number[j]);
					flag = true;
				}			
			}
		}
		if(flag==false) {
			System.out.println("There is no pairs in array");
		}
	}

}
