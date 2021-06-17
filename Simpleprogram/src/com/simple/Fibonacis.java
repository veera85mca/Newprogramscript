package com.simple;

public class Fibonacis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=1, fin=10;
		int temp=0;
		System.out.print("Fibona: "+n1+","+n2);
		for(int i=2;i<fin;i++) {
			temp = n1+n2;
			n1 = n2;
			n2 = temp;
			System.out.print(","+temp);
		}
	}

}
