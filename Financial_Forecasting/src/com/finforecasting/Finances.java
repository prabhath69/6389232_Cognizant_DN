package com.finforecasting;

import java.util.*;

public class Finances {

	public static int calculateFutureValue(int[] arr, int n) {
		if (n == 0) {
			return arr[n + 1] - arr[n];
		}
		return arr[n]-arr[n-1] + calculateFutureValue(arr, n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5,10,15,20 };
		int avgOfDiff = (calculateFutureValue(arr, arr.length-1))/arr.length;
		int result=arr[arr.length-1]+avgOfDiff;
		System.out.println("The next value will most probably be: "+result);
	}
}