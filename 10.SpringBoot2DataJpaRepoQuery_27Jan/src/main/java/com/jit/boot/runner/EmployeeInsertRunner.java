package com.jit.boot.runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Employee;
import com.jit.boot.repo.EmployeeRepo;

@Component
public class EmployeeInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * repo.save(new Employee(10, "A", 2.2)); repo.save(new Employee(11, "B", 3.2));
		 * repo.save(new Employee(12, "C", 4.2));
		 */
		List<Employee> empList = repo.getAllEmps();
		empList.forEach(System.out::println);
		System.out.println("========================");
		List<String> empNames = repo.getAllEmpNames();
		empNames.forEach(System.out::println);
		System.out.println("=========================");
		List<Object[]> idAndName = repo.getAllEmpIdAndNames();
		idAndName.stream().map(ob -> ob[0] + " - " + ob[1]).forEach(System.out::println);
		System.out.println("============================");
		Iterator<Object[]> itr = idAndName.iterator();
		while (itr.hasNext()) {
			Object[] ob = itr.next();
			System.out.println(ob[0] + " - " + ob[1]);
		}
		System.out.println("=============================");
		for (Object[] ob : idAndName) {
			System.out.println(ob[0] + " - " + ob[1]);
		}
	}
}
