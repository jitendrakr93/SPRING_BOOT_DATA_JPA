package com.jit.boot.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.boot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//SELECT * FROM EMPLOYEE WHERE EMP_DEPT=ed
	//List<Employee> findByempDept(String ed); //valid
	List<Employee> findByEmpDept(String empDept); // valid + naming rules

	/***
	 * No Condition Symbol = LessThan < LessThanEqual <= GreaterThan >
	 * GreaterThanEqual >= Between x,y
	 *
	 */
	//SELECT * FROM EMPLOYEE WHERE EMPSAL<=empSal
	List<Employee> findByempSalLessThanEqual(double empSal);

	//SELECT * FROM EMPLOYEE WHERE EMPSAL>empSal
	List<Employee> findByempSalGreaterThan(double empSal);

	//SELECT * FROM EMPLOYEE WHERE EMPSAL between empSal1 and empSal2
	List<Employee> findByEmpSalBetween(double empSal1, double empSal2);

	/**
	 * Not !=
	 *
	 * In IN operator
	 *
	 * NotIn NOT IN Operator
	 */
	//SELECT * FROM EMPLOYEE WHERE EMPDEPT != ?
	List<Employee> findByEmpDeptNot(String empDept);

	//SELECT * FROM EMPLOYEE WHERE EMPDID IN (_,_,_,_,..)
	List<Employee> findByEmpIdIn(List<Integer> ids);

	//SELECT * FROM EMPLOYEE WHERE EMPDID NOT IN (_,_,_,_,..)
	List<Employee> findByEmpIdNotIn(List<Integer> ids);

	/**
	 * And
	 *
	 * Or
	 */
	//SELECT * FROM EMPLOYEE WHERE EMPSAL>=? and EmpDept!=?
	List<Employee> findByEmpSalGreaterThanEqualAndEmpDeptNot(Double empSal, String empDept);

	//SELECT * FROM EMPLOYEE WHERE EMPSAL>=? or EmpDept!=?
	List<Employee> findByEmpSalGreaterThanEqualOrEmpDeptNot(Double empSal, String empDept);

	/***
	 *
	 * Is Null , Is Not Null
	 */
	//SELECT * FROM EMPLOYEE WHERE EMPNAME IS NULL
	List<Employee> findByEmpNameIsNull();

	//SELECT * FROM EMPLOYEE WHERE EMPNAME IS NOT NULL
	List<Employee> findByEmpNameIsNotNull();

	/**
	 * Like, NotLike (StartingWith , EndingWith, Containing)
	 *
	 */
	//SELECT * FROM EMPLOYEE WHERE EMPNAME like 'exp'
	List<Employee> findByEmpNameLike(String expression);

	//SELECT * FROM EMPLOYEE WHERE EMPNAME like 'exp'
	List<Employee> findByEmpNameNotLike(String expression);

	//SELECT * FROM EMPLOYEE WHERE EMPNAME like 'exp%'
	List<Employee> findByEmpNameStartingWith(String expression);

	//SELECT * FROM EMPLOYEE WHERE EMPNAME like '%exp'
	List<Employee> findByEmpNameEndingWith(String expression);

	//SELECT * FROM EMPLOYEE WHERE EMPNAME like '%exp%'
	List<Employee> findByEmpNameContaining(String expression);
}
