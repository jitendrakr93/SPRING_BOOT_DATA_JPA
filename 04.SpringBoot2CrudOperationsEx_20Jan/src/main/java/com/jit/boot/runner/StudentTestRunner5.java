package com.jit.boot.runner;

import java.util.Arrays;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Student;
import com.jit.boot.repo.StudentRepository;

//@Component
public class StudentTestRunner5 implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(new Student(105, "A", 2.0), new Student(106, "B", 6.2), new Student(107, "C", 2.0),
				new Student(108, "D", 2.7)));

		Iterable<Student> itb = repo.findAll();
		System.out.println(itb.getClass().getName());
		// ArrayList
		// core concepts for print
		// Java 8 - Method Reference
		itb.forEach(System.out::println);
		System.out.println("--------------------");
		
		// Java 8 - Lambda Expression
		itb.forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		
		// Iterator
		Iterator<Student> itr = itb.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		// For Each Loop
		for (Student s : itb) {
			System.out.println(s);
		}
	}

}