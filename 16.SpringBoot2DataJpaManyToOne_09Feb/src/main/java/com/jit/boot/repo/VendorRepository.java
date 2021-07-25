package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>{

}
