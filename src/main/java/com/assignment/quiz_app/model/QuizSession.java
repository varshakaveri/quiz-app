package com.assignment.quiz_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuizSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long questionId;
    private boolean isCorrect;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    // Getters and setters
}