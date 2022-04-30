package com.app.crud.controllers;

import com.app.crud.models.PersonModel;
import com.app.crud.models.RolModel;
import com.app.crud.repositories.IPersonRepository;
import com.app.crud.services.PersonService;
import com.app.crud.services.RolService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin
@RestController
@RequestMapping("/roles")
public class PersonController {

    @Autowired
    IPersonRepository personRepository;
    @Autowired
    PersonService personService;
    @Autowired
    private RolService rolService;

    @GetMapping(path = "/{rolId}/people")
    public List<PersonModel> getPersonByRolId(@PathVariable(value = "rolId") Long rolId) {
        return personRepository.findByRolId(rolId);
    }
    @GetMapping(path = "/people/{personId}")
    public Optional<PersonModel> getPerson(@PathVariable("personId") Long personId) {
        return personService.getPerson(personId);
    }
    @PostMapping(path = "/{rolId}/people")
    public Optional<PersonModel> createPerson(@PathVariable(value = "rolId") Long rolId, @RequestBody PersonModel personModel) {
        return rolService.getRol(rolId).map(rol -> {
            personModel.setRol(rol);
            return personService.createPerson(personModel);
        });
    }
    @PutMapping(path = "/{rolId}/people/{personId}")
    public PersonModel updatePerson(@PathVariable(value = "personId") Long id, @PathVariable(value = "personId") Long personId, @RequestBody PersonModel personModel) {
        Optional<PersonModel> findedPerson = personService.getPerson(id);
        findedPerson.get().setName(personModel.getName());
        findedPerson.get().setLastName(personModel.getLastName());
        findedPerson.get().setPhone(personModel.getPhone());
        final PersonModel updatedPerson = personService.updatePerson(findedPerson.get());
        return updatedPerson;
    }
    @DeleteMapping(path = "/{rolId}/people/{personId}")
    public String deletePerson(@PathVariable(value = "personId") Long personId, @RequestBody PersonModel personModel) {
        boolean ok = personService.deletePerson(personId);
            if (ok == true) {
                return "La persona fue eliminada";
            } else {
                return "La persona no fue encontrada";
            }
    }
    @DeleteMapping("/people")
    public String deletePeople() {
        personService.deletePeople();
        return "Todas las personas fueron eliminadas";
    }
}
