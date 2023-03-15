package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
@Autowired
private IEstudianteService estudianteService;
@GetMapping("/nuevoEstudiante")
public String nuevoE(Estudiante estudiante) {
	
	return "vistaEstudianteNuevo";
}

@PostMapping("/insertar")
public String insertarE(Estudiante estudiante) {
	this.estudianteService.agregarr(estudiante);
	return "redirect:/estudiantes/listaEstudiantes";
}

@GetMapping("/listaEstudiantes")
public String listaE(Estudiante estudiante,Model modelo) {
	List<Estudiante> list=this.estudianteService.buscarTodos();
	modelo.addAttribute("estudiantes",list);
	
	
	
	return "listaNuevaE";
}


@DeleteMapping("/eliminar/{id} ")
public String eliminarE(@PathVariable("id")Integer id) {
	this.estudianteService.borrarE(id);
	
	return "redirect:/estudiantes/listaEstudiantes"; 
}

}
