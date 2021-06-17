package com.javapro;

public class FindTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,9,15,2,14,5};
		int temp=0;
		int target = 15;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				temp = arr[i]+arr[j];
				if(temp == target) {
					System.out.println("Array index are: "+i+" "+j);
					break;
				}
			}
		}
	}

}
