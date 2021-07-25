package com.jit.boot.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.repo.DeptRepo;

@Component
public class TestJoinsRunner implements CommandLineRunner {
	@Autowired
	private DeptRepo repo;

	@Override
	public void run(String... args) throws Exception {
		List<Object[]> list = repo.getDeptEmpData();
		for (Object[] ob : list) {
			System.out.println(ob[0] + "-" + ob[1]);
		}
	}
}