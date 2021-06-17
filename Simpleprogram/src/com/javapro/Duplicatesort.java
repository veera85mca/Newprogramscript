package com.javapro;

public class Duplicatesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,0,1,1,2,2,2,3,4,5,5,5};
		int n= arr.length;
		int [] arra =  new int[n];
		int temp =0;
		int count = 0;
		for(int i=0;i<n-1;i++) {
			boolean flag =false;
			if(arr[i]!=arr[i+1]) {
				temp=arr[i];
				flag = true;
			}
			if(flag) {
				arra[count]=temp;
				count++;
			}
		}
		arra[count++] = arr[n-1];
		for(int i=0;i<count;i++) {
			arr[i] = arra[i];		
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(arr.length-count);
	
	}

}
