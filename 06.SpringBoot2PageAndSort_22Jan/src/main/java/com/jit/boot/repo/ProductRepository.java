package com.jit.boot.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jit.boot.model.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{

}
