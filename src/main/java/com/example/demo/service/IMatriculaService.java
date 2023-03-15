package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Matricular;
import com.example.demo.modelo.Temporal;

public interface IMatriculaService {
	public void insertarMa(Matricular matricular);
	
	public List<Matricular> buscarTodos();
}
