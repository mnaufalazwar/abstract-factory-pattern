package com.mnaufalazwar;

public class BankMandiri implements Bank {
	
	private final String name;
	
	public BankMandiri() {
		this.name = "Mandiri";
	}

	@Override
	public String getBankName() {
		return this.name;
	}

}
