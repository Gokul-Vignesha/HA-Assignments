package com.ha.dayone;

import java.util.Scanner;

/*
 *     Q5. Write a program which calculates the sum of all odd numbers upto a particular limit.
The limit will be an input to the program.

Examples:
1. If the limit is 10 then the program should print the sum of odd numbers from 1 to 10
i.e. 1 + 3 + 5 + 7 + 9 = 25
So the program should print 25.

2. If the limit is 15 then the program should print sum of odd numbers from 1 to 15
i.e. 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 = 64
So the program should print 64


 */


public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a limit in Integer : ");
		int limit = sc.nextInt();
		int sumOfOdd = 0;
		
		for (int i= 0; i <= limit; i++) {
				if(i%2 != 0) {
					sumOfOdd = sumOfOdd + i;
				}
			}
		
		System.out.println("Sum of all the odd numbers within the range is : " + sumOfOdd );
		
		sc.close();
		
		}

}
