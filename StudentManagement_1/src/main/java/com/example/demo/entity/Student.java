package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentsss")
public class Student {
	@Id
private int id;
	@Column(name="StudentName",length=100)
private String name;
private String email;
private String  address;
private int noOfMocks;
private boolean internship;
private int fees;
public int getId() {
	return id;
}
public void setId(int id) {
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getNoOfMocks() {
	return noOfMocks;
}
public void setNoOfMocks(int noOfMocks) {
	this.noOfMocks = noOfMocks;
}
public boolean isInternship() {
	return internship;
}
public void setInternship(boolean internship) {
	this.internship = internship;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
}