package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Student;
import com.jit.boot.repo.StudentRepository;

//@Component
public class StudentTestRunner1 implements CommandLineRunner{

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Student stu1 = new Student(10,"A",2.2);
		repo.save(stu1);
		
		Student stu2 = new Student(11,"B",3.2);
		repo.save(stu2);
		
		repo.save(new Student(101, "A", 2.2));
		repo.save(new Student(102, "B", 3.2));
		repo.save(new Student(103, "C", 4.2));
		repo.save(new Student(104, "D", 5.2));
	}

}