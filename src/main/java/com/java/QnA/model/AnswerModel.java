package com.java.QnA.model;

import com.java.QnA.pojo.Question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerModel {
	
	private long a_id;
	private Question ques;
	private String answer;
	private boolean status;
	
}
