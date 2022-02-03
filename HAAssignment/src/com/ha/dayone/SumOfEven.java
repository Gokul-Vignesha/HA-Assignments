package com.ha.dayone;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3. Create a program to display sum of even results 
		 * find the result and check whether it is odd or even? (Range is 0 to 50)
		 */

		int sumOfEven = 0;
		
		
		for(int i = 1; i <= 50; i++ ) {
			if(i % 2 == 0) {
				sumOfEven += i;
			}
		}
		
		if (sumOfEven % 2 == 0) {
			System.out.println("Sum of Even from 0 to 50 is : "+ sumOfEven +" and its EVEN ");
		}
		else {
			System.out.println("Sum of Even from 0 to 50 is : "+ sumOfEven + " and its ODD ");
		}
			 
		
	}

}
