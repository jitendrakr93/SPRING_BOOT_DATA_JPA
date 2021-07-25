package com.jit.boot.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.repo.EmployeeRepo;

@Component
public class NamedParamsTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		//repo.getEmpsByNamedParam("A",3.2)
		// repo.getEmpsByNamedParam(3.1,"A")
		repo.getEmpsBySelectedIds(List.of(10, 55, 36, 12)).forEach(System.out::println);
	}
}