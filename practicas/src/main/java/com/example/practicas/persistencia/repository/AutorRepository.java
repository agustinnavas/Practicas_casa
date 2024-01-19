package com.example.practicas.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practicas.persistencia.entities.AutorEntity;
import java.util.List;


public interface AutorRepository extends JpaRepository<AutorEntity, Long>{
	
	List <AutorEntity> findByNombre(String nombre);

}
