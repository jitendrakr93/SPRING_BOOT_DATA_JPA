package com.jit.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prod_tab")
public class Product {
	@Id
	@Column(name = "pid_col")
	private Integer pid;
	@Column(name = "pcode_col")
	private String pcode;
	@Column(name = "pcost_col")
	private Double pcost;
	@Column(name = "pmodel_col")
	private String pmodel;
	@ManyToOne
	@JoinColumn(name = "vidFk")
	private Vendor vob;
}
