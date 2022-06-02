package com.example.testforenersoft.repository;

import com.example.testforenersoft.models.ElectronicAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ElectronicAddressRepository extends JpaRepository<ElectronicAddressEntity, Long> {
}
