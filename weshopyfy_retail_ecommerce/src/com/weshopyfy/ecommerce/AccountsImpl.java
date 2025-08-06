package com.weshopyfy.ecommerce;

public class AccountsImpl implements Accounts {
	LoanAccount loanAccount=new LoanAccount();
	

	@Override
	public Accounts getMyAccount() {
		// TODO Auto-generated method stub
		return   loanAccount;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return loanAccount.getAccountType();
	}

}
