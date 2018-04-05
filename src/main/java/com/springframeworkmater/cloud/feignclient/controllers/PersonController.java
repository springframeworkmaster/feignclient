package com.springframeworkmater.cloud.feignclient.controllers;

import com.springframeworkmater.cloud.feignclient.PersonClient;
import com.springframeworkmater.cloud.feignclient.domains.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonClient personClient;

    public PersonController(PersonClient personClient) {
        this.personClient = personClient;
    }

    @GetMapping("/api/persons")
    public List<Person> getAllPerson(){
        return personClient.findAll();
    }
}
