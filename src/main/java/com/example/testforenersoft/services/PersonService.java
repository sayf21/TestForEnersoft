package com.example.testforenersoft.services;

import com.example.testforenersoft.models.PersonEntity;

import java.util.List;
import java.util.UUID;

public interface PersonService {
    PersonEntity createPerson(PersonEntity personEntity);

    List<PersonEntity> getListOfPersons();

    UUID deletePerson(UUID id);

    PersonEntity editPerson(UUID id, PersonEntity personEntity);
}
