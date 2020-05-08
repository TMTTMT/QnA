package com.java.QnA.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.QnA.model.QuestionModel;
import com.java.QnA.pojo.Question;
import com.java.QnA.repo.AnswerRepository;
import com.java.QnA.repo.QuestionRepository;
import com.java.QnA.service.IQuestionService;

@Service
@Transactional(noRollbackFor = Exception.class)
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public List<QuestionModel> getAllQuestion() {
		List<Question> questions = questionRepository.findByOrdersEquals(1);
		
		List<QuestionModel> questionModels = new ArrayList<QuestionModel>();
		
		for (Question question : questions) {
			QuestionModel questionModel = new QuestionModel();
			BeanUtils.copyProperties(question, questionModel);
			
			questionModels.add(questionModel);
		}
		return questionModels;
	}
	
}
