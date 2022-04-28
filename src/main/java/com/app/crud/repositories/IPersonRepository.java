package com.app.crud.repositories;

import com.app.crud.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<PersonModel, Long> {

}
