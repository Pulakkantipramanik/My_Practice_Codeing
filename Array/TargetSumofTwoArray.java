package com.array;

import java.util.Arrays;

public class TargetSumofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {8, 4, 2, 6};
		int target = 10;
		int left = 0;
		int right = arr.length-1;
		
		Arrays.sort(arr);

		
		while(left < right) {
			int sum= arr[left]+arr[right];
			if(target==sum) {
				System.out.println("target array value is " + arr[left]+" "+arr[right]);
				left ++;
				right --;
			}
			  else if(sum<target) {
				left ++ ;
			}
			  else {
				right -- ;
			}
		}
		

	}

}
