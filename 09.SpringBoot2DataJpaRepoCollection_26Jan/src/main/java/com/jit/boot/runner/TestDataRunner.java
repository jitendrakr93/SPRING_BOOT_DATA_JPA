package com.jit.boot.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Student;
import com.jit.boot.repo.StudentRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {

		repo.save(new Student(10, "SAM", 300.0, Set.of("ENG", "MAT", "SCI"), List.of(90, 75, 80),
				Map.of("CD", "A+", "JAVA", "A", "CHEM", "B+")));
		System.out.println("DONE");
	}

}
