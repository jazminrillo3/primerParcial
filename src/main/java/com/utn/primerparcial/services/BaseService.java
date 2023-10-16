package com.utn.primerparcial.services;

import com.utn.primerparcial.entities.BaseEntidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntidad, Id extends Serializable> {

    Page<E> findAll(Pageable pageable) throws Exception;
    List<E> findAll() throws Exception;

    E findById(Id id) throws Exception;

    E save(E entity) throws Exception;

    E update(Id id, E entity) throws Exception;

    boolean delete(Id id) throws Exception;

}
