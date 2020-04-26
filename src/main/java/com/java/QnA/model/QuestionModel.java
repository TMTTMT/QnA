package com.java.QnA.model;

import java.util.List;

import com.java.QnA.pojo.Answer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {
	
	private long id;
	private Integer orders;
	private String ques;
	private List<Answer> answerList;
	
}
