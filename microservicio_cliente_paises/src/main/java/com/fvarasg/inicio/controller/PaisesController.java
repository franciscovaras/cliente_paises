package com.fvarasg.inicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fvarasg.inicio.model.Pais;
import com.fvarasg.inicio.service.IPaisesService;

@RestController
public class PaisesController {

	@Autowired
	IPaisesService service;

	@GetMapping(value = "paises", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pais> paises() {
		return service.obtenerPaises();
	}
	
	@GetMapping(value = "paises/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pais> paises(@PathVariable String name){
		return service.buscarPaises(name);
		
	}
}
