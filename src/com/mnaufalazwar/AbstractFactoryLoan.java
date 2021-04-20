package com.mnaufalazwar;

public class AbstractFactoryLoan extends AbstractFactory {

	@Override
	public Bank getBank(String name) {
		return null;
	}

	@Override
	public Loan getLoan(String jenis) {
		if(jenis == null) {
			return null;
		}
		
		if(jenis.equalsIgnoreCase("Rumah")) {
			return new LoanRumah();
		} else if(jenis.equalsIgnoreCase("Usaha")) {
			return new LoanUsaha();
		} else {
			return null;
		}
	}

}
