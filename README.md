Spring boot quiz application This is a simple quiz application built using Spring Boot with an H2 in-memory database. The app provides APIs for starting a quiz session, fetching random multiple-choice questions, submitting answers, and viewing quiz results.


How to Run and Test the Quiz Application
To run and test the application locally, follow these steps:

Prerequisites
Ensure Java JDK is installed on your system.
Make sure Maven is installed. If not, download and install it from Maven's official website.
Steps
Clone the Repository: Clone the repository using Git by running the following command in your terminal or command prompt:

bash
Copy code
git clone <repository-link>
Replace <repository-link> with the actual URL of your Git repository.

Navigate to the Project Directory: Change directory to the project folder:

bash
Copy code
cd <directory-name>
Replace <directory-name> with the name of your project directory.

Build and Run the Application: Use Maven to build and run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
This command will download dependencies, compile the code, and start the application on http://localhost:8080.

Testing with Postman:

Start Postman (if not already running).
Set the request method to GET, POST, or PUT as specified by the endpoint you want to test.
Use the following base URL to test endpoints:
arduino
Copy code
http://localhost:8080
Include any required request parameters or body according to the API endpoint documentation provided in the README.md file within the repository.
Example Endpoints:

Start Quiz Session:
bash
Copy code
POST http://localhost:8080/api/quiz/start
Get Random Question:
bash
Copy code
GET http://localhost:8080/api/quiz/question
Submit Answer:
bash
Copy code
POST http://localhost:8080/api/quiz/answer
Include a JSON body with questionId and answer fields.
Get Quiz Results:
bash
Copy code
GET http://localhost:8080/api/quiz/results
Additional Information:

Ensure the H2 database console is accessible at http://localhost:8080/h2-console for database management.

