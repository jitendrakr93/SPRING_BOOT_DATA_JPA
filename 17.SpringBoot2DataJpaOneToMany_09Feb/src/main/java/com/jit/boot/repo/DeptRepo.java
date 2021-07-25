package com.jit.boot.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jit.boot.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Integer> {
	//@Query("SELECT D.deptCode,E.ename FROM Dept D INNER JOIN D.emps AS E")
	//@Query("SELECT D.deptCode,E.ename FROM Dept D LEFT OUTER JOIN D.emps AS E")
	@Query("SELECT D.deptCode,E.ename FROM Dept D RIGHT OUTER JOIN D.emps AS E")
	public List<Object[]> getDeptEmpData();
}