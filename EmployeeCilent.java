package com.niit.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee eRef = new Employee();
		eRef.setEid(100);
		eRef.setEname("Nikita");
		eRef.setEaddress("Janak Puri");
		
		System.out.println("Employee Details : " +eRef);
		
		//Spring way | IOC (Inversion of control)
		
		// we will not create objects , Instead IOC Container will create it 
		// we are just configuring the objects 
		Resource res = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(res); //API Spring container 
		//will parse Xml file and it will create Objects .
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		// Two ways of using getBean method 
		Employee e1 = (Employee)factory.getBean("emp1"); // type casting method 
// 		Employee e2 = factory.getBean("emp2",Employee.class); // specifying in the parameters 
		
		//Employee e1 = (Employee)context.getBean("emp1");
		//Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee Details :" +e1);
	//	System.out.println("Employee Details :" +e2);
	}

}
