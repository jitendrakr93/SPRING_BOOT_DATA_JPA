package com.jit.boot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@Id
	private Integer pid;
	private String pcode;
	private Double pcost;
	
	@Lob
	private byte[] img;
	
	@Lob
	private char[] data;
}
