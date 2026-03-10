package com.projeto_biodiversidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto_biodiversidade.entity.Species;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
