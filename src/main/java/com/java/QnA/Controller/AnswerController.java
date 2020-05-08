package com.java.QnA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.QnA.pojo.Answer;
import com.java.QnA.service.IAnswerService;

@Controller
@RequestMapping("/answer/*")
public class AnswerController {
	
	@Autowired
	IAnswerService answerService;

	@RequestMapping(value = "/getAnswerByQuestion")
	@ResponseBody
	public List<Answer> getAnswerByQuestion( @RequestParam("answerQuestionId") String answerQuestionId ) {
		return answerService.getAnswerByQuestion(answerQuestionId);
	}
	
}
