package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.Autor;
import com.utn.primerparcial.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "api/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

    public AutorController(AutorServiceImpl servicio) {
        super(servicio);
    }
}
