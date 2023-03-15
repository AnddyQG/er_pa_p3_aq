package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante estudiante);
	public void eliminarE(Integer id);
	public List<Estudiante> buscarTodos();
	
}
