package com.hibernate.model.manytomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Courses {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotBlank
@Size(min = 3,max = 10)
private String abbreviation;
@NotNull
@Min(value = 200)
private double fee;
@Column(length = 100)
private String module;
@Column(nullable = false, length = 100)
private String title;

@ManyToMany()
private Set<Student> student;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getAbbreviation() {
	return abbreviation;
}
public void setAbbreviation(String abbreviation) {
	this.abbreviation = abbreviation;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public String getModule() {
	return module;
}
public void setModule(String module) {
	this.module = module;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}






}
