package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Product;
import com.jit.boot.repo.ProductRepository;

//@Component
public class ProductDataSortRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {// Iterable<Product> itr = repo.findAll();
		// itr.forEach(System.out::println);
		// SQL:select * from product order by pcode asc
		// Sort sort = Sort.by("pcode"); // ASC
		// Sort sort = Sort.by(Direction.ASC,"pcode");
		// SQL:select * from product order by pcode desc
		// Sort sort = Sort.by(Direction.DESC,"pcode");
		// Sort sort = Sort.by("pcode","pcost");
		Sort sort = Sort.by(Direction.DESC, "pcode", "pcost");
		Iterable<Product> itr = repo.findAll(sort);
		itr.forEach(System.out::println);
	}

}
