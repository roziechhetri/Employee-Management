package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface EmpService {
	Employee getByID(String id);

	List<Employee> getAll();

	public	void add(Employee emp);

	public	Employee update(Employee emp);

	public void delete(String id);

	public void save(Employee emp);

}

