package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Student;
import com.jit.boot.repo.StudentRepository;

//@Component
public class StudentDataInsertRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	public void run(String... args) throws Exception {
		repo.save(new Student(101, "A", 300.0, "JAVA"));
		repo.save(new Student(102, "N", 400.0, "UI"));
		repo.save(new Student(103, "B", 500.0, "JAVA"));
		repo.save(new Student(104, "G", 800.0, "AWS"));
	}
}