package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorinjection/constructorconfig.xml");
		ConstructorInjectionDemo c = (ConstructorInjectionDemo) context.getBean("conName");
		System.out.println(c);
	}

}
