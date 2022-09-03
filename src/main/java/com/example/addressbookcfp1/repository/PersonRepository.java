package com.example.addressbookcfp1.repository;

import com.example.addressbookcfp1.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonRepository extends JpaRepository<Person, Long> {

}
