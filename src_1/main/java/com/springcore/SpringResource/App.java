package com.springcore.SpringResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    	Car c1=ac.getBean("car",Car.class);
    	
    	System.out.println("engine model no:"+c1.getEngine().getModel_no());
    	System.out.println("car company name is:"+c1.getCompany());
    	System.out.println("car model price is:"+c1.getPrice());

    	
    }
}
