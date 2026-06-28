package com.interview.platform.repository;

import com.interview.platform.entity.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
    List<UserAnswer> findByInterviewId(Long interviewId);
    List<UserAnswer> findByQuestionId(Long questionId);
}
