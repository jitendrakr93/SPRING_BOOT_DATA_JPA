package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
