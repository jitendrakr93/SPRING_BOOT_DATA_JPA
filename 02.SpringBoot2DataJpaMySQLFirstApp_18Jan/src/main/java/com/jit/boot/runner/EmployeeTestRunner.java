package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Employee;
import com.jit.boot.repository.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// find out impl class name
		System.out.println(repo.getClass().getName());
		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setEmpName("ABC");
		emp.setEmpSal(200.0);
		repo.save(emp);

	}

}
