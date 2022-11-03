package com.springfirstsampleproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is a project to manage employee data in TCS
 * project execution starts form main
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello developer in TCS" );
        /*java without spring:- tightly coupled*/  
        Employee emp= new Employee();
        emp.setEmpId(111);
        emp.setEmpName("Alam");
        emp.setEmpSalary(34000.5);
        System.out.println(emp);
		/*
		 * java with spring:- loosely coupled
		 * instantiating the spring IoC container which give data required
		 */        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); 
        /*getBean() return type is object type*/
        Employee empWithSpring=(Employee) context.getBean("TCSEmp1");
        	System.out.println(empWithSpring);
    }
}
