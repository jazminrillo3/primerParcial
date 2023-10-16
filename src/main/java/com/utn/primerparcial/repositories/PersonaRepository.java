package com.utn.primerparcial.repositories;

import com.utn.primerparcial.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

 /** Metodo de query **/

 List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

 boolean existsByDni(String dni);

  /** Metodo de anotación JPQL **/

  //Con parametros indexados
  @Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'" )
  List<Persona> search(String filtro);

  //Con parametros nombrados
  @Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'" )
  List<Persona> searchParam(@Param("filtro") String filtro);

  /** Metodo con query nativo **/

  @Query(
          value="SELECT * FROM persona WHERE persona.nombre LIKE '%:filtro%' OR persona.apellido LIKE '%:filtro%'",
          nativeQuery = true
  )
  List<Persona> searchNative(String filtro);

 }
