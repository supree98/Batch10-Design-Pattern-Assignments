package com.te.factory.assignment;

public abstract class Plan {

	public static double rate;
	
	public abstract void getRate();
	
	public void generateBill(int units) {
		
		System.out.println(rate*units + " $");
	}
	
}
