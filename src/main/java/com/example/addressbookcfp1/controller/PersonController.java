package com.example.addressbookcfp1.controller;

import com.example.addressbookcfp1.entity.Person;
import com.example.addressbookcfp1.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@Valid @RequestBody Person person) {
        Person savedPerson = personService.createPerson(person);
        return new ResponseEntity<Person>(savedPerson, HttpStatus.CREATED);
    }

    @PostMapping("/personList")
    public List<Person> personList(@RequestBody List<Person> person) {
        return personService.savePerson(person);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable long id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable long id) {
        return personService.deleteById(id);
    }
}