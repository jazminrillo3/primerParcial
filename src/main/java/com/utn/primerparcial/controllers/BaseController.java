package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.BaseEntidad;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntidad, Id extends Serializable> {

    //? indica que le vamos a pasar un objeto
    ResponseEntity<?> findAll();

    ResponseEntity<?> findAll(Pageable pageable);

    ResponseEntity<?> getOne(@PathVariable Id id);

    ResponseEntity<?> save(@RequestBody E entity);

    ResponseEntity<?> update(@PathVariable Id id, @RequestBody E entity);

    ResponseEntity<?> delete(@PathVariable Id id);

}
