package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionconfig.xml");
		EmployeesForCollection emp1 = (EmployeesForCollection) context.getBean("emp");

		System.out.println("testing class");
		System.out.print(emp1);

	}

}
