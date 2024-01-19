package com.example.practicas.services;

import java.util.List;

import com.example.practicas.model.LibroDTO;

public interface LibroService {
	
	LibroDTO createbook(LibroDTO librodto);
	
	List<LibroDTO>getBooks();

}
