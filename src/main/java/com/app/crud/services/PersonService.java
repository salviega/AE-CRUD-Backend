package com.app.crud.services;

import com.app.crud.models.PersonModel;
import com.app.crud.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private IPersonRepository personRepository;
    public List<PersonModel> getPeople() {
        return personRepository.findAll();
    }
    public Optional<PersonModel> getPerson(Long id) {
        return personRepository.findById(id);
    }
    public PersonModel createPerson(PersonModel personModel) {
        return personRepository.save(personModel);
    }
    public PersonModel updatePerson(PersonModel personModel) {
        return personRepository.save(personModel);
    }
    public boolean deletePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void deletePeople() {
        personRepository.deleteAll();
    }
}
