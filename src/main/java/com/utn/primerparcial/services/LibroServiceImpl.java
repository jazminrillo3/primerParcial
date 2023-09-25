package com.utn.primerparcial.services;

import com.utn.primerparcial.entities.Libro;
import com.utn.primerparcial.repositories.BaseRepository;
import com.utn.primerparcial.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{

    @Autowired
    private LibroRepository domicilioRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }

}
