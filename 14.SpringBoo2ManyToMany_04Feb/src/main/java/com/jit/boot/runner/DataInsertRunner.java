package com.jit.boot.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Course;
import com.jit.boot.model.Student;
import com.jit.boot.repo.CourseRepo;
import com.jit.boot.repo.StudentRepo;
@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private CourseRepo crepo;
	@Autowired
	private StudentRepo srepo;

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(58, "JAVA", 5000.0);
		Course c2 = new Course(59, "UI", 4000.0);
		Course c3 = new Course(60, "AWS", 5500.0);
		/*crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);*/
		Student s1 = new Student(10, "A", "HYD",Arrays.asList(c1,c2));
		Student s2 = new Student(11, "B", "CHN",Arrays.asList(c2,c3));
		srepo.save(s1);
		srepo.save(s2);
	}

}
