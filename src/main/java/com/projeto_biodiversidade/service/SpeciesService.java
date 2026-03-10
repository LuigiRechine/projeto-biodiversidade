package com.projeto_biodiversidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_biodiversidade.entity.Species;
import com.projeto_biodiversidade.repository.SpeciesRepository;

@Service
public class SpeciesService {

    @Autowired
    private SpeciesRepository repository;

    public Species save(Species species){
        return repository.save(species);
    }

    public List<Species> findAll(){
        return repository.findAll();
    }
}