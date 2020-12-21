package com.fvarasg.inicio.service;

import java.util.List;

import com.fvarasg.inicio.model.Pais;

public interface IPaisesService {
	List<Pais> obtenerPaises();
	List<Pais> buscarPaises(String name);
}
