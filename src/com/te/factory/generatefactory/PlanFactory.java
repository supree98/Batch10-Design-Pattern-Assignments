package com.te.factory.generatefactory;

import com.te.factory.assignment.Plan;
import com.te.factory.plans.*;

public class PlanFactory {

	public static Plan getPlan(String type) {
		
		if(type.equalsIgnoreCase("Domestic")) {
			return new Domestic();
		} else if(type.equalsIgnoreCase("Commercial")) {
			return new Commercial();
		} else if(type.equalsIgnoreCase("Institutional")) {
			return new Institutional();
		} else {
			return null;
		}
		
	}
	
	
	
}
