package com.kh.el.model.vo;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	private String address;
	private String sName;
	
	public Person(String name, int age, String address, String sName) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.sName = sName;
	}



	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getsName() {
		return sName;
	}



	public void setsName(String sName) {
		this.sName = sName;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", sName=" + sName + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, age, name, sName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name)
				&& Objects.equals(sName, other.sName);
	}
	
	
	
}
