package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Employee;
import com.jit.boot.repo.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setEmpId(200);
		emp.setEmpName("Jitendra");
		emp.setEmpSal(40000.00);
		repo.save(emp);
	}

}
