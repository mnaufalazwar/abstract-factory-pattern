package com.mnaufalazwar;

public class LoanUsaha extends Loan {

	@Override
	void getInerestRate(double rate) {
		super.rate = rate + 2;
	}

}
