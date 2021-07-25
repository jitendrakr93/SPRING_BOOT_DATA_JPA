package com.jit.boot.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Product;
import com.jit.boot.repo.ProductRepository;
//@Component
public class ProductInsertRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(new Product(101, "PEN", 25.0, "SNTY"), new Product(102, "BTL", 125.0, "SNTY"),
				new Product(103, "KYBRD", 2500.0, "NIT"), new Product(104, "MOUSE", 180.0, "NIT")));

	}

}
