package com.app.crud.controllers;

import com.app.crud.models.PersonModel;
import com.app.crud.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonModel> getPeople(Long id) {
        return personService.getPeople(id);
    }
    @GetMapping(path = "/{id}")
    public PersonModel getPerson(Long id) {
        return personService.getPerson(id);
    }
    @PostMapping
    public PersonModel createPerson(@RequestBody PersonModel personModel) {
        return personService.createPerson(personModel);
    }
    @PutMapping(path = "/{id}")
    public  PersonModel updatePerson(@RequestBody PersonModel personModel) {
        return personService.updatePerson(personModel);
    }
    @DeleteMapping(path = "/{id}")
    public String deletePerson(@PathVariable("id") Long id) {
        boolean ok = this.personService.deletePerson(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
