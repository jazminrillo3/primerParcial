package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.BaseEntidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntidad, Id extends Serializable> {

    //? indica que le vamos a pasar un objeto
    public ResponseEntity<?> findAll();

    public ResponseEntity<?> getOne(@PathVariable Id id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@PathVariable Id id, @RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable Id id);

}
