package com.example.practicas.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practicas.persistencia.entities.LibroEntity;

public interface LibroRepository extends JpaRepository<LibroEntity, Long>{
	
}
