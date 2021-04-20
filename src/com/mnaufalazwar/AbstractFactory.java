package com.mnaufalazwar;

abstract class AbstractFactory {
	
	public abstract Bank getBank(String name);
	public abstract Loan getLoan(String jenis);

}
