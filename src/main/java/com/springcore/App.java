package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// if we want to use student class here, we need to create object of student class but 
// we do not want to create object by our own and want DI to do it for us. 
// for that we need configure file for this.(make an xml file in src/main/java)

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		/*
		 * context is basically the IoC which will provide the object of student class.
		 */

		Student std1 = (Student) context.getBean("student1");
		System.out.println("adding value as an element(basic way)");
		System.out.println(std1);
		Student std2 = (Student) context.getBean("student2");
		System.out.println("\nadding value as an attribute without adding value tag in other line");
		System.out.println(std2);
		Student std3 = (Student) context.getBean("student3");
		System.out.println("\nusing p schema for inserting the values as an attribute");
		System.out.println(std3);

	}
}
