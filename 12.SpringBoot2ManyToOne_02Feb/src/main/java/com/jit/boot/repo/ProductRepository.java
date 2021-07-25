package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
