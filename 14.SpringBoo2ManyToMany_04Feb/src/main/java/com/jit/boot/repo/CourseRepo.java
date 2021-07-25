package com.jit.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
