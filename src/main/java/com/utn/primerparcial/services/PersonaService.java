package com.utn.primerparcial.services;

import com.utn.primerparcial.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{

    public List<Persona> search(String filtro) throws Exception;

    public Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
