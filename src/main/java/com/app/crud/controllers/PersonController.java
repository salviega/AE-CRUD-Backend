package com.app.crud.controllers;

import com.app.crud.models.PersonModel;
import com.app.crud.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonModel> getPeople() {
        return personService.getPeople();
    }
    @GetMapping(path = "/{id}")
    public Optional<PersonModel> getPerson(@PathVariable("id") Long id) {
        return personService.getPerson(id);
    }
    @PostMapping()
    public PersonModel createPerson(@RequestBody PersonModel personModel) {
        return personService.createPerson(personModel);
    }
    @PutMapping(path = "/{id}")
    public PersonModel updatePerson(@RequestBody PersonModel personModel) {
        return personService.updatePerson(personModel);
    }
    @DeleteMapping(path = "/{id}")
    public String deletePerson(Long id) {
        boolean ok = personService.deletePerson(id);
        if (ok == true) {
            return "La persona fue eliminada";
        } else {
            return "La persona no fue encontrada";
        }
    }
}
