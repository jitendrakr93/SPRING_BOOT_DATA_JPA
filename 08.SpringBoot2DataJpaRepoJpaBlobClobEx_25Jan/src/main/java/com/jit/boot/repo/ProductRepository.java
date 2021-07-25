package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
