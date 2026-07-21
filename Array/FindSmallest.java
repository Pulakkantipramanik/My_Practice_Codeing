package com.array;

public class FindSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 23 , 56 , 70 ,3, -8} ;
//		int small = arr[0];
		int small = 0;
		
		for(int i= 0 ;i<arr.length ;i++) {
			if(small>arr[i]) {
				small= arr[i];
			}
		}
		System.out.println(small);

	}

}
