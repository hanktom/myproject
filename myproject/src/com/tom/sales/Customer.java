package com.tom.sales;

public abstract class Customer {
	protected String name;
	protected int id;
	protected float discount = 0;
	int discountLimit = 10000;
	public abstract int calculcate(int amount);
	
	public float getDiscount(){
		return discount;
	}
	public void setDiscount(float discount){
		if (discount>0)
			this.discount = discount;
	}
}
