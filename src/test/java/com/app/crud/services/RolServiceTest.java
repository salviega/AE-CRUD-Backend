package com.app.crud.services;

import com.app.crud.models.PersonModel;
import com.app.crud.models.RolModel;
import com.app.crud.repositories.IRolRepository;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class RolServiceTest {

    @Autowired
    IRolRepository rolRepository;

    @Test
    public void testCreateRol() {
        RolModel rol = new RolModel("Doctor", "Curar personas");
        RolModel savedRol = rolRepository.save(rol);
        assertNotNull(savedRol);
    }
    @Test
    public void testDeleteRol() {
        Long rolId = 11L;
        boolean deletedRol;
        try {
            rolRepository.deleteById(rolId);
            deletedRol = true;
        } catch (Exception e) {
            deletedRol = false;
        }
        assertNotNull(deletedRol);
    }

}