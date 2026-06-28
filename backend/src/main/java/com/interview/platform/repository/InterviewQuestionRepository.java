package com.interview.platform.repository;

import com.interview.platform.entity.InterviewQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InterviewQuestionRepository extends JpaRepository<InterviewQuestion, Long> {
    List<InterviewQuestion> findByInterviewId(Long interviewId);
    List<InterviewQuestion> findByInterviewIdOrderByQuestionNumber(Long interviewId);
}
