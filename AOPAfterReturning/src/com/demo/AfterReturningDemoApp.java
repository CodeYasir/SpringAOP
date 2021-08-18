package com.demo;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.dao.AccountDAO;



public class AfterReturningDemoApp {

	public static void main(String[] args) {

		    AnnotationConfigApplicationContext context =
				  new AnnotationConfigApplicationContext(DemoConfig.class);
		
		    AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//  Call method to find the accounts
		    List<Account> theAccounts = theAccountDAO.findAccounts();
		
		    System.out.println("Modified result: After method execution");
		    System.out.println(theAccounts);
		
		    context.close();
	}

}










