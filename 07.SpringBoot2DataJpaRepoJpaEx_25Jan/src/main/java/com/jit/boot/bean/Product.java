package com.jit.boot.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private Integer pid;
	private String pcode;
	private Double pcost;

	@Temporal(TemporalType.DATE)
	private Date dteA;

	@Temporal(TemporalType.TIME)
	private Date dteB;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dteC;
}
