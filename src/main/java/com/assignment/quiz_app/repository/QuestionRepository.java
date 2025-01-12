package com.assignment.quiz_app.repository;

import com.assignment.quiz_app.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query(value = "SELECT * FROM QUESTION ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Question getRandomQuestion();

}