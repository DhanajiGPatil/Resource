package com.springcore.SpringQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Company c1=ac.getBean("comp",Company.class);
		
		System.out.println("company name is:"+c1.getName());
		System.out.println("Employee name is:"+c1.getEmp().getEmp_name());

		
		
	}

}
