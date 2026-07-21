package com.array;

public class FoundNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr [] = { 12,45,3,7,9 } ;
//		int found = 4 ;
//		for( int i = 0 ; i < arr.length; i++) {
//			if(found==arr[i]) {
//			System.out.println("checking/found value is "+ arr[i]+" founded ");
//		}
//			else {
//				System.out.println("not found");
//			}
//		}
		int arr [] = { 12,45,3,7,9 } ;
		int found = 4 ;
		boolean isfound = false ;
		for( int i = 0 ; i < arr.length; i++) {
			if(found==arr[i]) {
			 isfound = true ;
			 break;
		}
		}
			if(isfound==false) {
				System.out.println("not found");
			}
			else {
				System.out.println("found");
			}
		}

	

}
