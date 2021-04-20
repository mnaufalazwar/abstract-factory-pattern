package com.mnaufalazwar;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Bank")) {
			return new AbstractFactoryBank();
		} else if(choice.equalsIgnoreCase("Loan")) {
			return new AbstractFactoryLoan();
		}
		
		return null;
	}

}
