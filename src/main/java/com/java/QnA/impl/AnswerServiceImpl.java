package com.java.QnA.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.QnA.pojo.Answer;
import com.java.QnA.pojo.Question;
import com.java.QnA.repo.AnswerRepository;
import com.java.QnA.repo.QuestionRepository;
import com.java.QnA.service.IAnswerService;

@Service
@Transactional(noRollbackFor = Exception.class)
public class AnswerServiceImpl implements IAnswerService {
	
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public List<Answer> getAnswerByQuestion(String id) {
		List<Answer> answerByQuestion = new ArrayList<>();
		Optional<Question> question = questionRepository.findById(Long.parseLong(id));
		if(question.isPresent()) {
			answerByQuestion = answerRepository.findByQuestionAndOrdersEquals(question.get(), 1);
		}
		return answerByQuestion;
	}

}
