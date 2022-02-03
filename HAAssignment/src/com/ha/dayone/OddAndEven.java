package com.ha.dayone;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
			
		System.out.println("Printing using For Loop");
		for (int i =0; i <= 30; i++) {
			if(i % 2 == 0 ) {
				System.out.println(i +" is a Even Number");
			}
			else {
				System.out.println(i + " is a Odd Number");
			}
		}
		
		
		
		System.out.println("\n\n\n Printing using While Loop \n");
		
		while (j <= 30) {
			j++;
			if(j % 2 == 0 ) {
				System.out.println(j +" is a Even Number");
			}
			else {
				System.out.println(j + " is a Odd Number");
			}
			
		}

	}

}
