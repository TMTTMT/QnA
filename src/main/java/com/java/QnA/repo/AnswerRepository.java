package com.java.QnA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.QnA.pojo.Question;

public interface AnswerRepository extends JpaRepository<Question,Long> {

}
