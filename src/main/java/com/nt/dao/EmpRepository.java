package com.nt.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee,String>{

	Optional<Employee> findById(String id);

	void deleteById(String id);

	

}
