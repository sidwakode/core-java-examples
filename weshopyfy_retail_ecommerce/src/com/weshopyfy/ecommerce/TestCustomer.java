package com.weshopyfy.ecommerce;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer =new Customer();
		Accounts loanAccount=customer.getMyAccounts();
		System.out.println(loanAccount.getAccountType());
		
		
	}

}
