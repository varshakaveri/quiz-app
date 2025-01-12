package com.assignment.quiz_app.service;

import com.assignment.quiz_app.model.Question;
import com.assignment.quiz_app.model.QuizSession;
import com.assignment.quiz_app.repository.QuestionRepository;
import com.assignment.quiz_app.repository.QuizSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizSessionRepository quizSessionRepository;

    @Override
    public Long startNewSession(Long userId) {
        // Simply return userId for now
        return userId;
    }

    @Override
    public Question getRandomQuestion() {
        return questionRepository.getRandomQuestion();
    }

    @Override
    public boolean submitAnswer(Long sessionId, Long questionId, String answer) {
        Question question = questionRepository.findById(questionId).orElseThrow();
        boolean isCorrect = question.getCorrectAnswer().equalsIgnoreCase(answer);

        QuizSession session = new QuizSession();
        session.setUserId(sessionId);
        session.setQuestionId(questionId);
        session.setCorrect(isCorrect);

        quizSessionRepository.save(session);
        return isCorrect;
    }

    @Override
    public List<QuizSession> getQuizDetails(Long userId) {
        return quizSessionRepository.findByUserId(userId);
    }
}
