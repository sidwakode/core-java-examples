package com.weshopyfy.ecommerce;

import java.io.Serializable;

public class LoanAccount  implements Serializable, Accounts{

	private int loanId;
	private double loanAmount;
	private String accountType; 
	
	
	public String getAccountType() {
		return accountType="Loan Account";
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public Accounts getMyAccount() {
		// TODO Auto-generated method stub
		Accounts accounts=new LoanAccount();
	
		return accounts;
		 
		 
		
	}
	
	
} 
