package com.assignment.quiz_app.controller;

import com.assignment.quiz_app.model.Question;
import com.assignment.quiz_app.model.QuizSession;
import com.assignment.quiz_app.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/start")
    public ResponseEntity<Long> startNewQuiz(@RequestParam Long userId) {
        Long sessionId = quizService.startNewSession(userId);
        return ResponseEntity.ok(sessionId);
    }

    @GetMapping("/question")
    public ResponseEntity<Question> getRandomQuestion() {
        Question question = quizService.getRandomQuestion();
        return ResponseEntity.ok(question);
    }

    @PostMapping("/answer")
    public ResponseEntity<Boolean> submitAnswer(
            @RequestParam Long sessionId,
            @RequestParam Long questionId,
            @RequestParam String answer) {
        boolean isCorrect = quizService.submitAnswer(sessionId, questionId, answer);
        return ResponseEntity.ok(isCorrect);
    }

    @GetMapping("/summary")
    public ResponseEntity<List<QuizSession>> getQuizSummary(@RequestParam Long userId) {
        List<QuizSession> sessions = quizService.getQuizDetails(userId);
        return ResponseEntity.ok(sessions);
    }
}
