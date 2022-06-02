package com.example.testforenersoft.repository;

import com.example.testforenersoft.models.IdentifiedObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentifiedObjectRepository extends JpaRepository<IdentifiedObjectEntity, Long> {
}