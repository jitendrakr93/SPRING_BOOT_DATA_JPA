package com.jit.boot.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.Product;
import com.jit.boot.repo.ProductRepository;
@Component
public class TestJpaRepoRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(100, "ABC", 500.0, new Date(), new Date(), new Date()));

	}

}
