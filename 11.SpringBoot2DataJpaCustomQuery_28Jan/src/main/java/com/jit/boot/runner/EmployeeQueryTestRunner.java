package com.jit.boot.runner;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Employee;
import com.jit.boot.repo.EmployeeRepo;
//@Component
public class EmployeeQueryTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		/* List<Employee> list = repo.getAllEmpsBySal(120.0);
		 list.forEach(System.out::println); 
		 //----Java 8 Stream operation----
		 list.stream() .map(emp-> "Hello Mr/Mrs/Ms."+ emp.getEmpName())
		 .forEach(System.out::println); Double data = list.stream()
		 .collect(Collectors.summingDouble(Employee::getEmpSal));
		 System.out.println("Full Sal :" + data);*/
		 
		
		 // Employee emp = repo.getOneEmpsById(10); System.out.println(emp);
		 
		
		/*Object emp = repo.getOneEmpNameSalByIdOrName(10,"A");
		 System.out.println(emp); Object[] ob=(Object[])emp;
		 System.out.println(ob[0]+"-"+ob[1]);*/
		 
		//Sort data using Java 8. Stream
		
		 //repo.getAllEmps() .stream() .sorted((e1,e2)->e2.getEmpId().compareTo(e1.getEmpId())) .forEach(System.out::println);
		 
		repo.getAllEmpsSorted().forEach(System.out::println);
	}
}