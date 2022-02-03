package com.healthasyst.shoppingcart;

public class Shirt extends Item {
    
	private char size;
	private char colorCode;
	
	public Shirt(char size, char colorCode, String description, int quantity, double price) {
		super(description, quantity, price);
		this.size = size;
		this.colorCode = colorCode;
	}
	
	public void display() {
		System.out.println(" \n -----------  Printing Shirt Details ----------- \n");
		System.out.println("Shirt Description : " + super.getDescription());
		System.out.println("Shirt Size        : " + this.size);
		System.out.println("Shirt Color Code  : " + this.colorCode);
		System.out.println("Shirt Quantity    : " + super.getQuantity());
		System.out.println("Shirt Price       : " + super.getPrice());
		System.out.println("\n ----------------------------------------------- \n ");
	}
	
	
}

