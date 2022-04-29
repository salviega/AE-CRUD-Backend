package com.app.crud.services;


import com.app.crud.repositories.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    @Autowired
    private IRolRepository rolRepository;
}
