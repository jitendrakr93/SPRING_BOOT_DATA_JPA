package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Student;
import com.jit.boot.repo.StudentRepository;

//@Component
public class TestStudentOprRunner1 implements CommandLineRunner{

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(10, "A", 2.2));
		repo.save(new Student(11, "B", 3.2));
		repo.save(new Student(12, "C", 4.2));
		repo.save(new Student(13, "D", 5.2));
		repo.deleteById(10);
		//repo.delete(new Student(102, null, null));
		System.out.println("12 Deleted...");
		
	}

}
