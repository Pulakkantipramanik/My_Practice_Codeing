package com.array;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23 , 45,67,32 };
		int count = 0 ;
		int sum = 0 ;
		for(int i = 0 ; i<arr.length; i++) {
			sum = sum + arr[i];
			count ++;
		}
		System.out.println(sum/count);

	}

}
