package com.example.testforenersoft.services.impl;

import com.example.testforenersoft.models.PersonEntity;
import com.example.testforenersoft.repository.PersonRepository;
import com.example.testforenersoft.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Log
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public PersonEntity createPerson(PersonEntity personEntity) {
        if (personRepository.findByFirstNameAndLastName(personEntity.getFirstName(), personEntity.getLastName()) != null) {
            throw new EntityExistsException("Role with name = " + personEntity.getFirstName() +
                    " and surname = " + personEntity.getLastName() + " already exists");
        }
        log.info("Saving person: " + personEntity.getFirstName() + " " + personEntity.getLastName());
        return personRepository.save(personEntity);
    }

    @Override
    public List<PersonEntity> getListOfPersons() {
        log.info("Get all persons");
        return personRepository.findAll();
    }

    @Override
    public UUID deletePerson(UUID id) {
        log.info("Delete person with id " + id);
        return personRepository.deleteByUuid(id);
    }

    @Override
    public PersonEntity editPerson(UUID id, PersonEntity personEntity) {
        PersonEntity person = personRepository.findByUuid(id);
        if (person == null) {
            throw new EntityNotFoundException("Person with id = " + id + " not found");
        }
        log.info("Editing person with id " + id);
        person.setElectronicAddress(personEntity.getElectronicAddress());
        person.setFirstName(personEntity.getFirstName());
        person.setLandlineNumber(personEntity.getLandlineNumber());
        person.setLastName(personEntity.getLastName());
        person.setMName(personEntity.getMName());
        person.setMobilePhone(personEntity.getMobilePhone());
        person.setPrefix(personEntity.getPrefix());
        person.setSpecialNeed(personEntity.getSpecialNeed());
        person.setSuffix(personEntity.getSuffix());
        return personRepository.save(person);
    }
}
