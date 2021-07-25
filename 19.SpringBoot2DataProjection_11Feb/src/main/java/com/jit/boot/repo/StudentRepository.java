package com.jit.boot.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//1. define one view interface
	interface MyView {
		String getStdName();

		Double getStdFee();
	}

	//SQL: select sname,sfee from student sid<=?
	List<MyView> findByStdIdLessThanEqual(Integer sid);

	//2. define one view interface
	interface MyViewTwo {
		String getStdName();

		String getStdCourse();
	}

	//SQL: select sname, course from student where sname is not null
	List<MyViewTwo> findByStdNameIsNotNull();
}