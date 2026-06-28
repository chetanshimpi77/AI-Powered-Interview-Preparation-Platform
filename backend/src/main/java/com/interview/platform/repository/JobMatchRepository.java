package com.interview.platform.repository;

import com.interview.platform.entity.JobMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobMatchRepository extends JpaRepository<JobMatch, Long> {
    List<JobMatch> findByUserId(Long userId);
    List<JobMatch> findByUserIdOrderByCreatedAtDesc(Long userId);
}
