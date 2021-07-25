package com.jit.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {
	@Id
	@Column(name = "eid_col")
	private Integer eid;
	@Column(name = "ename_col")
	private String ename;
	@Column(name = "esal_col")
	private Double esal;
}