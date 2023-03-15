package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {

	@Id
	@SequenceGenerator(name = "seq_mate",sequenceName = "seq_mate",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq_mate" )
	@Column(name = "mate_id")
	private Integer id;
	@Column(name = "mate_nombre")
	private String nombre;
	@Column(name = "mate_descripcion")
	private String descripcion;
	@Column(name="mate_numeroCreditos")
	private Integer numeroCreditos;
	@Column(name = "mate_numeroEstudiantes")
	private Integer numeroEstudiantes;
	
	@OneToMany(mappedBy = "materia")
	private List<Matricular> list;
	
	
	
	
	
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", numeroCreditos="
				+ numeroCreditos + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	public Integer getNumeroEstudiantes() {
		return numeroEstudiantes;
	}
	public void setNumeroEstudiantes(Integer numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	public List<Matricular> getList() {
		return list;
	}
	public void setList(List<Matricular> list) {
		this.list = list;
	}
	
	
		
}









