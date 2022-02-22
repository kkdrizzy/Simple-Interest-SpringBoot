package com.example.SimpleInterest.Repository;

import com.example.SimpleInterest.ModelDAO.InterestVariable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleInterestRepository extends JpaRepository<InterestVariable, Long> {
}
