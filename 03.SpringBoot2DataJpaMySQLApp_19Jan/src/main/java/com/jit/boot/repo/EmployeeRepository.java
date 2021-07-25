package com.jit.boot.repo;

import org.springframework.data.repository.CrudRepository;

import com.jit.boot.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
