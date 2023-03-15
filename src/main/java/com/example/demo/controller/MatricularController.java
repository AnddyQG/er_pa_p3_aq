package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Matricular;

import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatricularController {
@Autowired
private IMatriculaService iMatriculaService;

@GetMapping("/nuevaMatricula")
public String nuevaMa(Matricular matricular) {
	
	
	return "vistaNuevaMatricula";
}
@PostMapping("/insertar")
public String insertarMa(Matricular temporal) {
	this.iMatriculaService.insertarMa(temporal);
	
	return "redirect:/matriculas/listaMatriculas";
}
@GetMapping("/listaMatriculas")
public String listaE(Matricular matricular,Model modelo) {
	List<Matricular> list=this.iMatriculaService.buscarTodos();
	modelo.addAttribute("matriculas",list);
	
	
	
	return "listaNuevaMa";
}

}
