package com.demo.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.Account;



@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
			
	// add a new method: findAccounts()
	
	public List<Account> findAccounts() {
		
		List<Account> myAccounts = new ArrayList<>();
		
		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Madhu", "Platinum");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		
		return myAccounts;		
	}
	
}





