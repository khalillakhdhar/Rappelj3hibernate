package com.hibernate.model.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.Null;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Min(value = 16)
private int age;
@Column(columnDefinition = "varchar(100) dafault 'candidat'")
private String grade;
@Column(nullable = false, length = 40)
private String name;

@ManyToMany(fetch = FetchType.LAZY, cascade = {
		CascadeType.PERSIST,
		CascadeType.MERGE		
}
		)
private Set<Courses> course;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}






}
