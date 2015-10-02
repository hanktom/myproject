package com.tom.sales;

public abstract class Customer {
	protected String name;
	protected int id;
	protected float discount = 0;
	protected int discountLimit = 10000;
	public abstract int calculcate(int amount);
	
}
