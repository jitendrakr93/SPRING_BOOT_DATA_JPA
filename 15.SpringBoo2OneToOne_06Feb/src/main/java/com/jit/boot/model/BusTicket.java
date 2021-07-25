package com.jit.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BusTicket {
	@Id
	private Integer btid;
	private String seatNo;
	private String bfrom;
	private String bto;
	private Double bcost;
}