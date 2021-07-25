package com.jit.boot.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Product;
import com.jit.boot.repo.ProductRepository;

@Component
public class ProductPagingRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Pageable pageable = PageRequest.of(0, 3);
		Page<Product> page = repo.findAll(pageable);
		List<Product> list = page.getContent();
		list.forEach(System.out::println);
		System.out.println("===================");
		System.out.println("First Page : " + page.isFirst());
		System.out.println("Last Page : " + page.isLast());
		System.out.println("Next Page : " + page.hasNext());
		System.out.println("Previous Page : " + page.hasPrevious());
		System.out.println("Empty Page : " + page.isEmpty());
		System.out.println("Page Size : " + page.getSize());
		System.out.println("Page Number : " + page.getNumber());
		System.out.println("Total Pages : " + page.getTotalPages());
		System.out.println("Total Rows : " + page.getTotalElements());
	}

}
