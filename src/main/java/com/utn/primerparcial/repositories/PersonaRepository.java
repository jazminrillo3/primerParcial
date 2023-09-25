package com.utn.primerparcial.repositories;

import com.utn.primerparcial.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
 }
