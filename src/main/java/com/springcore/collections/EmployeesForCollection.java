package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeesForCollection {

	@Override
	public String toString() {
		return "EmployeesForCollection [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}

	private String name;
	private List<String> phones;
	private Set<String> addresses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	private Map<String, String> courses;

	public EmployeesForCollection(String name, List<String> phones, Set<String> addressesF,
			Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addressesF;
		this.courses = courses;
	}

	public EmployeesForCollection() {
		super();
		// TODO Auto-generated constructor stub
	}

}
