package com.java.QnA.service;

import java.util.List;

import com.java.QnA.pojo.Answer;

public interface IAnswerService {
	public List<Answer> getAnswerByQuestion(String id);
}
