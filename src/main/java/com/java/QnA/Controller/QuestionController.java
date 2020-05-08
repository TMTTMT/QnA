package com.java.QnA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.QnA.model.QuestionModel;
import com.java.QnA.service.IQuestionService;

@Controller
@RequestMapping("/question/*")
public class QuestionController {

	@Autowired
	IQuestionService questionService;
	
	@RequestMapping(value = "/getAllQuestion")
	@ResponseBody
	public List<QuestionModel> getAllQuestion() {
		return questionService.getAllQuestion();
	}
	
}
