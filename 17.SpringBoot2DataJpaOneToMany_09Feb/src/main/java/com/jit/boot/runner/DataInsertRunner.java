package com.jit.boot.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Dept;
import com.jit.boot.model.Employee;
import com.jit.boot.repo.DeptRepo;
import com.jit.boot.repo.EmployeeRepository;

//@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository erepo;
	@Autowired
	private DeptRepo drepo;

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(10, "A", 3.3);
		Employee e2 = new Employee(11, "B", 4.3);
		Employee e3 = new Employee(12, "C", 5.3);
		Employee e4 = new Employee(13, "D", 6.6);
		Employee e5 = new Employee(14, "E", 8.6);
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		erepo.save(e5);
		Dept d1 = new Dept(521, "DEV", "SAM", Arrays.asList(e1, e2));
		Dept d2 = new Dept(522, "QA", "SYED", Arrays.asList(e2, e4));
		Dept d3 = new Dept(523, "BA", "AJAY", null);
		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
	}
}