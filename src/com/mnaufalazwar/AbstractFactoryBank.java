package com.mnaufalazwar;

public class AbstractFactoryBank extends AbstractFactory {

	@Override
	public Bank getBank(String name) {
		if(name == null) {
			return null;
		}
		
		if(name.equalsIgnoreCase("Mandiri")) {
			return new BankMandiri();
		} else if(name.equalsIgnoreCase("BNI")) {
			return new BankBni();
		}
		else {
			return null;
		}
	}

	@Override
	public Loan getLoan(String jenis) {
		return null;
	}

}
