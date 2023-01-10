package com.persistencia.fiap.controller;

import java.util.List;

import com.persistencia.fiap.entities.Unity;
import com.persistencia.fiap.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/unities")
public class ServiceControler {

    @Autowired
    ServiceRepository repository;

    @GetMapping
    public List<Unity> getAll(){
        return repository.findAll();
    }

}
