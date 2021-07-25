package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
