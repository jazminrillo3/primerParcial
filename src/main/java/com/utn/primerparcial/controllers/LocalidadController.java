package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.Localidad;
import com.utn.primerparcial.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "api/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

    public LocalidadController(LocalidadServiceImpl servicio) {
        super(servicio);
    }
}
