package com.app.cdac.acts.homeservices.pojo;

import javax.persistence.Entity;

@Entity
public class Customer {
	private Integer id;
	private String name, email, password, contact;
	private Address address;

	public Customer() {
		super();
		System.out.println("in customer ctor");
	}

	public Customer(String name, String email, String password, String contact) {
		super();

		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
