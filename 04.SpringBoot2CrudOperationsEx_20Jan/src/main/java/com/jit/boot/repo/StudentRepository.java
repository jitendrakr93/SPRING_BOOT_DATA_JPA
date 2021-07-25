package com.jit.boot.repo;

import org.springframework.data.repository.CrudRepository;

import com.jit.boot.bean.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
