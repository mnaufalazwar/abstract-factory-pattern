package com.mnaufalazwar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Mau pake bank apa?");
			String bankName = reader.readLine();
			
			Bank myBank = FactoryCreator.getFactory("Bank").getBank(bankName);
			
			System.out.println("Pinjaman buat apa?");
			String loanType = reader.readLine();
			
			Loan myLoan = FactoryCreator.getFactory("Loan").getLoan(loanType);
			myLoan.getInerestRate(5.0);
			myLoan.calculateLoanPayment(1000_000_000, 10, myBank);
			
		} catch(IOException e) {
			System.out.println("IOException : " + e.getMessage());
		}
		
	}

}
