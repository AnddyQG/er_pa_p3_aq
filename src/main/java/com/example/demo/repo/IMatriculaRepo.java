package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Matricular;


public interface IMatriculaRepo {

	public void insertarMa(Matricular matricular);
	public List<Matricular> buscarTodos();
	
}
