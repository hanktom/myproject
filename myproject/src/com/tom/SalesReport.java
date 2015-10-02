package com.tom;

import com.tom.sales.Customer;
import com.tom.sales.GoldenCustomer;
import com.tom.sales.NormalCustomer;
import com.tom.sales.SilverCustomer;

public class SalesReport {

	public static void main(String[] args) {
		Customer c1 = new NormalCustomer();
		c1.calculcate(8000);
		Customer c2 = new SilverCustomer();
		c2.calculcate(10000);
		Customer c3 = new GoldenCustomer();
		c3.calculcate(10000);
	}

}
