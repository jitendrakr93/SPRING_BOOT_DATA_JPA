package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
