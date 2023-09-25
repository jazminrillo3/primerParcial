package com.utn.primerparcial.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidad extends BaseEntidad{

    private String denominacion;

}
