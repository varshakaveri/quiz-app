package com.assignment.quiz_app.repository;

import com.assignment.quiz_app.model.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizSessionRepository extends JpaRepository<QuizSession, Long> {
    List<QuizSession> findByUserId(Long userId);
}
