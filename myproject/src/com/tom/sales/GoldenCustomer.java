package com.tom.sales;

public class GoldenCustomer extends SilverCustomer {
	int returnMoney;

	@Override
	public int calculcate(int amount) {
		// TODO Auto-generated method stub
		returnMoney = (int)(amount*0.05f);
		
		return super.calculcate(amount);
	}
	
	
}
