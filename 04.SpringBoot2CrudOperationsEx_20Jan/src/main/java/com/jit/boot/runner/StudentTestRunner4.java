package com.jit.boot.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Student;
import com.jit.boot.repo.StudentRepository;

//@Component
public class StudentTestRunner4 implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(new Student(105, "A", 2.0), new Student(106, "B", 6.2), new Student(107, "C", 2.0),
				new Student(108, "D", 2.7)));

		boolean exist = repo.existsById(108);
		System.out.println(exist);
	}

}