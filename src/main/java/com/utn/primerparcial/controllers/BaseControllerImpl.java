package com.utn.primerparcial.controllers;

import com.utn.primerparcial.entities.BaseEntidad;
import com.utn.primerparcial.services.BaseServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends BaseEntidad, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    protected S servicio;

    public BaseControllerImpl(S servicio) {
        this.servicio = servicio;
    }

    @GetMapping("")
    public ResponseEntity<?> findAll(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.findAll());
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.findById(id));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.save(entity));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.update(id, entity));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body(servicio.delete(id));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }


}
