package com.java.QnA.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "result")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long r_id;
	
	@NotNull
	@Column(columnDefinition = "TEXT")
	private String answer;
	
	@NotNull
	@Column(columnDefinition = "int")
	private Integer corrects;
	
}
