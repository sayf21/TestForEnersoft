package com.example.testforenersoft.controllers;

import com.example.testforenersoft.models.PersonEntity;
import com.example.testforenersoft.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<PersonEntity> createRole(@RequestBody PersonEntity personEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(personEntity));
    }

    @GetMapping
    public ResponseEntity<List<PersonEntity>> getListOfRoles() {
        return ResponseEntity.ok().body(personService.getListOfPersons());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UUID> deleteRole(@PathVariable("id") UUID id) {
        return ResponseEntity.ok().body(personService.deletePerson(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonEntity> editRole(@PathVariable("id") UUID id, @RequestBody PersonEntity personEntity) {
        return ResponseEntity.ok().body(personService.editPerson(id, personEntity));
    }
}
