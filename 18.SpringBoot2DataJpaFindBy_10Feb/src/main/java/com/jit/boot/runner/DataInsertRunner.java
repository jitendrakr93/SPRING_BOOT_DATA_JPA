package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Employee;
import com.jit.boot.repo.EmployeeRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	public void run(String... args) throws Exception {
		repo.save(new Employee(10, "SAM", 500.0, "DEV"));
		repo.save(new Employee(11, "RAM", 600.0, "DEV"));
		repo.save(new Employee(12, "SYED", 450.0, "QA"));
		repo.save(new Employee(13, "VINAY", 280.0, "QA"));
		repo.save(new Employee(14, "JAI", 120.0, "DEV"));
		repo.save(new Employee(15, "SUN", 590.0, "BA"));
	}
}