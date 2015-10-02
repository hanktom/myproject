package com.tom.sales;

public class NormalCustomer extends Customer {
	
	@Override
	public int calculcate(int amount) {
		System.out.println(amount+"\t"+(amount-(int)(amount*discount)));
		return amount-(int)(amount*discount);
	}

	

}
