package com.array;

public class FindMaximamValueFromArray {
	public static void main(String[] args) {
		int big = 0;
	int []a = { 27 , 9 , 97 , 3 };
	for(int i = 0 ; i<a.length; i++) {
		if(big < a[i]) {
			big=a[i];
		}
	}
	System.out.println("big array value is  "+big);
}
}

