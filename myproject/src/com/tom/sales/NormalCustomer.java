package com.tom.sales;

public class NormalCustomer extends Customer {
	
	@Override
	public int calculcate(int amount) {
		return amount-(int)(amount*discount);
	}

	

}
