package com.utn.primerparcial.repositories;

import com.utn.primerparcial.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
