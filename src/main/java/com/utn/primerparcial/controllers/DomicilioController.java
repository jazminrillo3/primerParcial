package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.Domicilio;
import com.utn.primerparcial.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "api/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{

    public DomicilioController(DomicilioServiceImpl servicio) {
        super(servicio);
    }
}
