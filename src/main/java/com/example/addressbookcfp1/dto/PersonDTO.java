package com.example.addressbookcfp1.dto;

import lombok.Data;

@Data
public class PersonDTO {
    public String firstName;
    public String lastName;

    public PersonDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}