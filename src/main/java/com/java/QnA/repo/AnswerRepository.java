package com.java.QnA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.QnA.pojo.Answer;
import com.java.QnA.pojo.Question;

public interface AnswerRepository extends JpaRepository<Question,Long> {

	List<Answer> findByQuestionAndOrdersEquals(Question question, int orders);

}
