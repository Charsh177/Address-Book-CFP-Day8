package com.example.addressbookcfp1.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "person1")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "First name invalid!!!")
    private String firstName;

    @NotEmpty
    @Size(min = 3, message = "Person last name should at least 3 characters, first letter capital must")
    private String lastName;
    @Pattern(regexp = "^[0-9]{10}$")
    private long phoneNumber;

    @NotEmpty
    @Email
    private String email;
    private String address;

    public Person() {
    }

    public Person(String firstName, String lastName, long phoneNumber, String email, String address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}