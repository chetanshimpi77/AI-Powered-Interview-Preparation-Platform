package com.interview.platform.repository;

import com.interview.platform.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByInterviewIdOrderByCreatedAt(Long interviewId);
}
