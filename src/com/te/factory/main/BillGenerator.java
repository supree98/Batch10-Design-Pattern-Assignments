package com.te.factory.main;

import java.util.Scanner;
import com.te.factory.assignment.Plan;
import com.te.factory.generatefactory.PlanFactory;

public class BillGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type of plan to generate bill");
	
		String planType = sc.next();
		
		System.out.println("Enter the units");
		
		int units = sc.nextInt();
		
		Plan plan = PlanFactory.getPlan(planType);
				
		try {
			
			plan.getRate();
			
		} catch(NullPointerException e) {
			
			System.out.println("There is no type of "+planType);
			sc.close();
			return;
			
		}
		
		System.out.print("The total amount for "+planType+" is : ");
		
		plan.generateBill(units);
		
		sc.close();
	}

}
