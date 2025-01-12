-- Insert sample users
INSERT INTO USERS (id, name) VALUES (1, 'John Doe'), (2, 'Jane Smith');

-- Insert sample questions
INSERT INTO QUESTION (id, text, optionA, optionB, optionC, optionD, correctAnswer) VALUES
(1, 'What is the capital of France?', 'Berlin', 'Madrid', 'Paris', 'Rome', 'C'),
(2, 'Which planet is known as the Red Planet?', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'B'),
(3, 'What is 2 + 2?', '3', '4', '5', '6', 'B');
