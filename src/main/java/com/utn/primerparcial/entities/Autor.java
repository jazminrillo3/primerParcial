package com.utn.primerparcial.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor extends BaseEntidad{

    private String nombre;
    private String apellido;
    private String biografia;
}
