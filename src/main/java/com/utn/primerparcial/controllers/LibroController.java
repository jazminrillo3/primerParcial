package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.Libro;
import com.utn.primerparcial.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "api/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

    public LibroController(LibroServiceImpl servicio) {
        super(servicio);
    }
}
