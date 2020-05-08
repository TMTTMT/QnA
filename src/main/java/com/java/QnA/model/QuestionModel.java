package com.java.QnA.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {
	
	private long q_id;
	private Integer orders;
	private String question;
	private List<AnswerModel> answerList;
	
}
