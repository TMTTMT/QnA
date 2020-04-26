package com.java.QnA.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long a_id;
	
	@ManyToOne
	@JoinColumn(name = "q_id", nullable = false)
	private Question ques;
	
	@NotNull
	@Column(columnDefinition = "TEXT")
	private String answer;
	
//	@org.hibernate.annotations.Type(type="true_false")
	@NotNull
	@Column(columnDefinition = "BOOLEAN")
	private Boolean status;
}
