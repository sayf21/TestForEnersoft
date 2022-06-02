package com.example.testforenersoft.repository;

import com.example.testforenersoft.models.TelephoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneNumberRepository extends JpaRepository<TelephoneNumber, Long> {
}
