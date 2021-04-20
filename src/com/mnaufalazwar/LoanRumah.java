package com.mnaufalazwar;

public class LoanRumah extends Loan {

	@Override
	void getInerestRate(double rate) {
		super.rate = rate + 1;
	}

}
