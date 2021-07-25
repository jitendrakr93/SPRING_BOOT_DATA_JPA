package com.jit.boot.runner;

import java.util.Arrays;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Student;
import com.jit.boot.repo.StudentRepository;

//@Component
public class StudentTestRunner6 implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(new Student(105, "A", 2.0), new Student(106, "B", 6.2), new Student(107, "C", 2.0),
				new Student(108, "D", 2.7)));

		Iterable<Student> list = repo.findAllById(Arrays.asList(110, 105, 108, 221, 365));
		list.forEach(System.out::println);
	}

}