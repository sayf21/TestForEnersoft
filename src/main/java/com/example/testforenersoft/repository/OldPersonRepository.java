package com.example.testforenersoft.repository;

import com.example.testforenersoft.models.OldPersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OldPersonRepository extends JpaRepository<OldPersonEntity, Long> {
}