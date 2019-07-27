package com.app.cdac.acts.homeservices.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	private Integer id;
	private String flatNo, street, colony, landmark, zipcode, state, city;

	public Address() {
		super();
		System.out.println("in address ctor");
	}

	public Address(Integer id, String flatNo, String street, String colony, String landmark, String zipcode,
			String state, String city) {
		super();
		this.id = id;
		this.flatNo = flatNo;
		this.street = street;
		this.colony = colony;
		this.landmark = landmark;
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "flat_number",length = 10,nullable = false)
	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	@Column(name = "flat_number",length = 10,nullable = false)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Column(name = "flat_number",length = 10,nullable = false)
	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getLandmark() {
		return landmark;
	}
	@Column(name = "landmark",length = 50,nullable = false)
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Column(name = "state",length = 20,nullable = false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Column(name = " city",length = 20,nullable = false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
