package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Materia;
import com.example.demo.repo.IMateriaRepo;

@Service
public class MateriaServiceImpl implements IMateriaService{
@Autowired
private IMateriaRepo iMateriaRepo;
	@Override
	public void ingresar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.insertar(materia);
		materia.setNumeroEstudiantes(0);
	}

}
