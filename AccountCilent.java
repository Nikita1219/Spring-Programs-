package com.niit.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("account.xml");
		UserAccountService uas = (UserAccountService) context.getBean("userAccountService");
		System.out.println(uas.getName());
		System.out.println(uas.getDetails());
		System.out.println(uas.getDescription());
	}

}
