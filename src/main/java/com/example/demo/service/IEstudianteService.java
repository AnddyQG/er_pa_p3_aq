package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregarr(Estudiante estudiante);
	public void borrarE(Integer id);
	public List<Estudiante> buscarTodos();

}
