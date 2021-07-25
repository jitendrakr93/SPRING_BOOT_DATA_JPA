package com.jit.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger {
	@Id
	private Integer pid;
	private String pname;
	private String gender;
	private Integer age;
	@ManyToOne // 1...1
	@JoinColumn(name = "tckt_id_fk", unique = true)
	private BusTicket ticket;
}