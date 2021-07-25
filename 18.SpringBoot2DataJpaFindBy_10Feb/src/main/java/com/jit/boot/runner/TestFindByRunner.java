package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.repo.EmployeeRepository;

@Component
public class TestFindByRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	public void run(String... args) throws Exception {
	//List<Employee> emps = repo.findByEmpDept("DEV");
	//emps.forEach(System.out::println);
	//repo.findByempSalLessThanEqual(300.0).forEach(System.out::println);
	//repo.findByempSalGreaterThan(300.0).forEach(System.out::println);
	//repo.findByEmpSalBetween(300.0,500.0).forEach(System.out::println);
	//repo.findByEmpDeptNot("DEV").forEach(System.out::println);
	//repo.findByEmpIdIn(Arrays.asList(10,12,14,16,18,20,22)).forEach(System.out::println);
	//repo.findByEmpIdNotIn(Arrays.asList(12,14,18,20,22)).forEach(System.out::println);
	//repo.findByEmpSalGreaterThanEqualAndEmpDeptNot(120.0,"QA").forEach(System.out::println);
	//repo.findByEmpSalGreaterThanEqualOrEmpDeptNot(120.0,"QA").forEach(System.out::println);
	//repo.findByEmpNameIsNull().forEach(System.out::println);
	//repo.findByEmpNameIsNotNull().forEach(System.out::println);
	repo.findByEmpNameNotLike("S%").forEach(System.out::println);
	//repo.findByEmpNameLike("S%").forEach(System.out::println);
	//repo.findByEmpNameStartingWith("S").forEach(System.out::println);
	//repo.findByEmpNameLike("%M").forEach(System.out::println);
	//repo.findByEmpNameEndingWith("M").forEach(System.out::println);
	//repo.findByEmpNameLike("%A%").forEach(System.out::println);
	//repo.findByEmpNameContaining("A").forEach(System.out::println);
	}
}