package com.projeto_biodiversidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_biodiversidade.entity.Species;
import com.projeto_biodiversidade.service.SpeciesService;

@RestController
@RequestMapping("/species")
@CrossOrigin("*")
public class SpeciesController {

    @Autowired
    private SpeciesService service;

    @PostMapping
    public Species create(@RequestBody Species species){
        return service.save(species);
    }

    @GetMapping
    public List<Species> list(){
        return service.findAll();
    }
}