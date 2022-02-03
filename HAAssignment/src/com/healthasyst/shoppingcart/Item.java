package com.healthasyst.shoppingcart;

public class Item {
	
	private int itemid;
	private String description;
	private int quantity;
	private double price;
	
	
	public Item(String description, int quantity, double price)  {
		this.description = description;
		this.quantity = quantity;
		this.price = price;	
	}
	

	// setter for Description and Quantity
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
		
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
