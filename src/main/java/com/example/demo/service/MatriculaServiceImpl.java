package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricular;
import com.example.demo.modelo.Temporal;
import com.example.demo.repo.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
@Autowired
private IMatriculaRepo iMatriculaRepo;
	@Override
	public void insertarMa(Matricular matricular) {
		// TODO Auto-generated method stub
		this.iMatriculaRepo.insertarMa(matricular);
		Materia materia= new Materia();
		Integer aux=+1;
		materia.setNumeroEstudiantes(aux);
	}
	@Override
	public List<Matricular> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.buscarTodos();
	}

}
