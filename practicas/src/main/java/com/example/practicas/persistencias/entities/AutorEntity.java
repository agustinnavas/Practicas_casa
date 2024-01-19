package com.example.practicas.persistencias.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.OneToMany;

public class AutorEntity {

    private Long id;
    private String nombre;
    private String nacionalidad;

    @OneToMany(mappedBy = "autor")
    private List<LibroEntity> libros = new ArrayList<>();

	public AutorEntity(Long id, String nombre, String nacionalidad, List<LibroEntity> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<LibroEntity> getLibros() {
		return libros;
	}

	public void setLibros(List<LibroEntity> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "AutorEntity [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}

 
    
}

