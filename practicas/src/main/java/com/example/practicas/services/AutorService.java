package com.example.practicas.services;

import java.util.List;

import com.example.practicas.model.AutorDTO;

public interface AutorService {

	AutorDTO createAuthor(AutorDTO autorDTO);

	List<AutorDTO>getAuthors();
}
