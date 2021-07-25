package com.jit.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jit.boot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	// @Query("SELECT P.pcode , V.vcode FROM Product P INNER JOIN P.vob AS V ")
	// @Query("SELECT P.pcode , V.vcode FROM Product P LEFT OUTER JOIN P.vob AS V ")
	@Query("SELECT P.pcode , V.vcode FROM Product P RIGHT JOIN P.vob AS V ")
	// @Query("SELECT P.pcode , V.vcode FROM Product P FULL OUTE JOIN P.vob AS V ")
	public List<Object[]> getProductAndVendorCodes();
}
