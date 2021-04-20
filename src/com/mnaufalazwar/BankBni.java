package com.mnaufalazwar;

public class BankBni implements Bank {
	
	private final String name;
	
	public BankBni() {
		this.name = "BNI";
	}

	@Override
	public String getBankName() {
		return this.name;
	}

}
