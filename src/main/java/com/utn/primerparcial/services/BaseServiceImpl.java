package com.utn.primerparcial.services;

import com.utn.primerparcial.entities.BaseEntidad;
import com.utn.primerparcial.repositories.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends BaseEntidad, Id extends Serializable> implements BaseService<E, Id>{

    protected BaseRepository<E, Id> baseRepository;

    public BaseServiceImpl(BaseRepository<E, Id> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseRepository.findAll();
            if(entities.isEmpty()) throw new Exception("Aún no se han cargado registros");
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(Id id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            if (!entityOptional.isPresent()) throw new Exception("No existe ningún registro con el ID indicado");
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Id id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            if (!entityOptional.isPresent()) throw new Exception("No existe ningún registro con el ID indicado");
            E persona = baseRepository.save(entity);
            return persona;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Id id) throws Exception {
        try{
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else{
                throw new Exception("No existe ningún registro con el ID indicado");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
