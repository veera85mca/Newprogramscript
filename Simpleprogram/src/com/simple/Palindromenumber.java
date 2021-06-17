package com.simple;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=451, r, temp=0;
		int rever=n;
		while(n>0) {
			r=n%10;
			temp = (temp*10)+r;
			n=n/10;
		}
		if(rever==temp)
		System.out.println(temp);
		else {
			System.out.println("not palindrome");
		}
			
	}

}
