package com.java.QnA.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long q_id;
	
	@NotNull
	@Column(columnDefinition = "int default 0")
	private Integer orders;
	
	@NotNull
	@Column(columnDefinition = "TEXT")
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ques")
	@JsonIgnore
	private List<Answer> answerList;
	
	//@Transient
	//private ArrayList<Answer> answer;
}
