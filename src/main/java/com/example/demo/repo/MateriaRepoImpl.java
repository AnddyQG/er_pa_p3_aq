package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MateriaRepoImpl implements IMateriaRepo{
@PersistenceContext
private EntityManager entityManager;
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

}
