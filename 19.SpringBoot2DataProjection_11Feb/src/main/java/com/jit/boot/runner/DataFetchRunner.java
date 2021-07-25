package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.repo.StudentRepository;

@Component
public class DataFetchRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	public void run(String... args) throws Exception {
		
		 /* List<MyView> list = repo.findByStdIdLessThanEqual(200); 
		  for(MyView m : list ){ 
			  System.out.println(m.getStdName() + " -" + m.getStdFee() ); 
			}*/
		 
		repo.findByStdNameIsNotNull().stream().map(ob -> ob.getStdName() + "-" + ob.getStdCourse())
				.forEach(System.out::println);
		
	}
}