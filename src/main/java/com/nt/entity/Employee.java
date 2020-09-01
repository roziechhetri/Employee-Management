package com.nt.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "emp", schema = "employee")
public class Employee {

	@Id
	private String id;
	private String firstName;
    private String lastName;
    private String emailAddress;
	private int salary;
	
	

	public Employee() {

	}

	@PrePersist
	public void setUUID() {

		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
    public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	

	public int getSalary() {
		return salary;
	}

	public void setSal(int salary) {
		this.salary = salary;
	}

}
