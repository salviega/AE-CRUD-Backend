package com.app.crud.repositories;

import com.app.crud.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPersonRepository extends JpaRepository<PersonModel, Long> {
    List<PersonModel> findByRolId(Long rolId);
    Optional<PersonModel> findByIdAndRolId(Long id, Long rolId);
}
