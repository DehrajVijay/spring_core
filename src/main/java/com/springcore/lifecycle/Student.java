package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [subject=" + subject + "]";
	}

	@PostConstruct
	void init() {
		System.out.println("This is init method.");
	}

	@PreDestroy
	void destror() {
		System.out.println("This is destroy method.");
	}

}
