package com.example.addressbookcfp1.services;

import com.example.addressbookcfp1.entity.Person;
import com.example.addressbookcfp1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> savePerson(List<Person> personList) {
        return personRepository.saveAll(personList);
    }

    public Person getPersonById(long id) {
        return personRepository.findById(id).orElse(null);
    }

    public String deleteById(long id) {
       personRepository.deleteById(id);
       return "Person information removed !!! " +  id;
    }

    public Person updatePerson(Person person) {
        Person existingPerson = personRepository.findById(person.getId()).orElse(null);
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setEmail(person.getEmail());
        existingPerson.setPhoneNumber(person.getPhoneNumber());
        existingPerson.setAddress(person.getAddress());
        return personRepository.save(existingPerson);
    }

}