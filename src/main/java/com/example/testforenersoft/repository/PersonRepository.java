package com.example.testforenersoft.repository;

import com.example.testforenersoft.models.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    PersonEntity findByFirstNameAndLastName (String name, String surname);

    UUID deleteByUuid(UUID id);

    PersonEntity findByUuid(UUID id);
}
