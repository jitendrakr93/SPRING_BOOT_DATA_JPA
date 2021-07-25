package com.jit.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jit.boot.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM com.jit.boot.bean.Employee e")
	List<Employee> getAllEmps();
	
	@Query("SELECT e.empName FROM com.jit.boot.bean.Employee e")
	List<String> getAllEmpNames();
	
	@Query("SELECT e.empId,e.empName FROM com.jit.boot.bean.Employee e")
	List<Object[]> getAllEmpIdAndNames();
}
