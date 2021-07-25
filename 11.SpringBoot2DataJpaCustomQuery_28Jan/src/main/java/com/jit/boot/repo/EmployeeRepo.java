package com.jit.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jit.boot.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM com.jit.boot.bean.Employee e")
	List<Employee> getAllEmps();

	@Query("SELECT e.empName FROM com.jit.boot.bean.Employee e")
	List<String> getAllEmpNames();

	@Query("SELECT e.empId,e.empName FROM com.jit.boot.bean.Employee e")
	List<Object[]> getAllEmpIdAndNames();

	// ------------using parameters----------
	@Query("SELECT e FROM com.jit.boot.bean.Employee e WHERE e.empSal<?1")
	List<Employee> getAllEmpsBySal(Double empSal);

	/* List not required if query returns one row data */
	@Query("SELECT e FROM com.jit.boot.bean.Employee e WHERE e.empId=?1")
	Employee getOneEmpsById(Integer empId);

	/* List not required if query returns one row data */
	/*
	 * Use Object inplace of Object[] for return type, later down cast
	 */
	@Query("SELECT e.empName,e.empSal FROM com.jit.boot.bean.Employee e WHERE e.empId=?1 or e.empName=?2")
	Object getOneEmpNameSalByIdOrName(Integer eid, String ename);

	// param name can be any name
	@Query("SELECT e FROM com.jit.boot.bean.Employee e ORDER BY e.empName DESC")
	List<Employee> getAllEmpsSorted();
	
	//---------Named parameters------------
	
	@Query("SELECT e FROM Employee e WHERE e.empName=:ename or e.empSal>=:esal")
	List<Employee> getEmpsByNamedParam(Double esal,String ename);
	//List<Employee> getEmpsByNamedParam(String ename,Double esal);
	//in operator takes multiple values
	
	@Query("SELECT e FROM Employee e WHERE e.empId in (:eids)")
	List<Employee> getEmpsBySelectedIds(List<Integer> eids);

}
