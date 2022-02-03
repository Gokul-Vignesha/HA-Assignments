package com.ha.dayone;

import java.util.Scanner;

public class PrintInBetweenValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6. Write a program which takes two integers N and M and 
		 * produces last samples of N of the integers from N-1 to N-M.
		 * 
		 * for Ex:
		 *  1) if user inputs N = 10 M = 4 output will be 9 8 7 6 means it produces last 4 samples from 0 to 10.
         *  2) if user inputs N = 5 M = 2 output will be 4 3
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Enter first Integer Value : ");
		int firstValue = sc.nextInt();
		System.out.println(" Enter Second Integer Value : ");
		int secondValue = sc.nextInt();
		
		for (int i = (firstValue - 1); i >= (firstValue - secondValue); i-- ) {
			System.out.println(i);
		}
		
		
		sc.close();		
		
	}

}
