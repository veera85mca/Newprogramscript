package com.simple;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String newstr = "I am good";
		String rev ="";
		char [] ch = newstr.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		System.out.println(rev);*/
		
		int n=5;
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Fact"+fact);
	}
}
