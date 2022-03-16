package com.hibernate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User_profiles {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false, length = 100)
private String address1;
@Column(length = 100)
private String address2;
@Column(length = 100,nullable = false)
private String city;
@Column(length = 100,nullable = false)
private String country;
@Temporal(TemporalType.DATE)
private Date dob;
@Enumerated(EnumType.STRING)
@Column(length = 10,nullable = false)
private Gender gender;
@Column(length = 15, nullable = false)
private String phone_number;
@Column(length = 100,nullable = false)
private String state;
@Column(length = 100,nullable = false)
private String street;
@Column(length = 32,nullable = false)
private String zipcode;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "user_id", referencedColumnName = "id")
private Users user;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getAddress1() {
	return address1;
}

public void setAddress1(String address1) {
	this.address1 = address1;
}

public String getAddress2() {
	return address2;
}

public void setAddress2(String address2) {
	this.address2 = address2;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public String getPhone_number() {
	return phone_number;
}

public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}







}
