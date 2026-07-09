# AI-Powered Interview Preparation Platform

## Overview

The AI-Powered Interview Preparation Platform is a web application that helps students prepare for technical interviews. It allows users to create interviews based on different technologies, answer AI-generated questions, receive instant feedback, and track their performance.

The platform uses Spring Boot for the backend, React for the frontend, MySQL for data storage, JWT for authentication, and the Gemini API for AI-powered interview question generation and evaluation.

---

## Features

### User Features
- User Registration and Login
- Secure JWT Authentication
- Create Interview Sessions
- Select Technology and Difficulty Level
- AI-Generated Interview Questions
- Submit Answers
- AI-Based Answer Evaluation
- Interview History
- Performance Tracking
- Dashboard with Statistics

### Admin Features
- Manage Users
- View Interview Records
- Monitor Platform Activity

---

## Technologies Used

### Frontend
- React.js
- HTML
- CSS
- JavaScript
- Axios

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- JWT Authentication
- Maven

### Database
- MySQL

### AI Integration
- OpenAI API

### Tools
- Git
- GitHub
- Postman
- IntelliJ IDEA / VS Code

---

## Project Structure

```
AI-Interview-Platform
│
├── backend
│   ├── controllers
│   ├── services
│   ├── repositories
│   ├── entities
│   ├── security
│   ├── dto
│   └── config
│
├── frontend
│   ├── components
│   ├── pages
│   ├── services
│   └── assets
│
└── README.md
```

---

## System Workflow

1. User registers or logs in.
2. User creates a new interview.
3. User selects technology and difficulty level.
4. OpenAi API generates interview questions.
5. User submits answers.
6. AI evaluates the answers.
7. Scores and feedback are stored in the database.
8. User can view previous interview history and performance.

---

## Installation

### Clone the Repository

```bash
git clone https://github.com/chetanshimpi77/Ai-Powered-Interview-Preparation-Platform.git
```

```bash
cd ai-interview-platform
```

---

### Backend Setup

1. Open the backend project.
2. Configure MySQL in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/interview_platform
spring.datasource.username=root
spring.datasource.password=your_password

gemini.api.key=YOUR_GEMINI_API_KEY
```

3. Run the project.

```bash
mvn spring-boot:run
```

---

### Frontend Setup

```bash
cd frontend
npm install
npm start
```

---

## Security

- JWT Authentication
- Password Encryption using BCrypt
- Role-Based Authorization
- Protected REST APIs
- Secure API Access

---

## Future Improvements

- Video Interview Support
- Coding Assessment
- Email Notifications
- Leaderboard
- Interview Scheduling

---

## Author

**Chetan Sonawane**

GitHub: https://github.com/chetanshimpi77

---

## License

This project is developed for learning and educational purposes.