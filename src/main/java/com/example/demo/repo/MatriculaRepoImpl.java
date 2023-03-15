package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Matricular;
import com.example.demo.modelo.Temporal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{
@PersistenceContext
private EntityManager entityManager;
	@Override
	public void insertarMa(Matricular matricular) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricular);
	}
	@Override
	public List<Matricular> buscarTodos() {
	TypedQuery<Matricular> myQuery = this.entityManager.createQuery("SELECT m FROM Matricular m",Matricular.class);
 
		
		return myQuery.getResultList();
	}

}
