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
@Table(name = "ven_tab")
public class Vendor {
	@Id
	@Column(name = "vid_col")
	private Integer vid;
	@Column(name = "vcode_col")
	private String vcode;
	@Column(name = "vloc_col")
	private String vloc;
}