package com.interview.platform.repository;

import com.interview.platform.entity.CompanyQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CompanyQuestionRepository extends JpaRepository<CompanyQuestion, Long> {
    List<CompanyQuestion> findByCompanyName(String companyName);
    List<CompanyQuestion> findByCompanyNameAndTechnology(String companyName, String technology);
    List<CompanyQuestion> findByCompanyNameAndTechnologyAndDifficulty(String companyName, String technology, CompanyQuestion.DifficultyLevel difficulty);
}
