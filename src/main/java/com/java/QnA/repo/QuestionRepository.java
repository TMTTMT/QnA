package com.java.QnA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.QnA.pojo.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	public List<Question> findByOrdersEquals(int orders);
}
