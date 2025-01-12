package com.assignment.quiz_app.service;

import com.assignment.quiz_app.model.Question;
import com.assignment.quiz_app.model.QuizSession;

import java.util.List;

public interface QuizService {
    Long startNewSession(Long userId);
    Question getRandomQuestion();
    boolean submitAnswer(Long sessionId, Long questionId, String answer);
    List<QuizSession> getQuizDetails(Long userId);
}
