package com.jit.boot.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	@Column(name = "sid")
	private Integer stdId;

	@Column(name = "sname")
	private String stdName;

	@Column(name = "sfee")
	private Double stdFee;

	@ElementCollection
	@CollectionTable(name = "std_sub_tab", joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "subj")
	private Set<String> subjects;

	@ElementCollection
	@CollectionTable(name = "std_marks_tab", joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "marks")
	@OrderColumn(name = "pos")
	private List<Integer> marks;

	@ElementCollection
	@CollectionTable(name = "std_labs_tab", joinColumns = @JoinColumn(name = "sid"))
	@MapKeyColumn(name = "lname")
	@Column(name = "grade")
	private Map<String, String> labExam;

}
