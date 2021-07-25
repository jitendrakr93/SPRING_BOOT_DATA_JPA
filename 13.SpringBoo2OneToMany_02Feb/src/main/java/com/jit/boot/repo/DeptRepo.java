package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Integer>{

}
