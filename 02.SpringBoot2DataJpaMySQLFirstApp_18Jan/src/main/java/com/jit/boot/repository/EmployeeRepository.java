package com.jit.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.jit.boot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
