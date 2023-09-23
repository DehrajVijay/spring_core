package com.springcore.constructorinjection;

public class ConstructorInjectionDemo {

	private String name;
	private int personId;
	private Certi certi;

	ConstructorInjectionDemo(String name, int personId, Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + " : " + this.certi.name;
	}

}
