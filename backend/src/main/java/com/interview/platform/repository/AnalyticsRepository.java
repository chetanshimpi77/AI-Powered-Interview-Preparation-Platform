package com.interview.platform.repository;

import com.interview.platform.entity.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    Optional<Analytics> findByUserId(Long userId);
}
