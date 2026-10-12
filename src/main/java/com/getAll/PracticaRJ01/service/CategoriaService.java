package com.getAll.PracticaRJ01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.getAll.PracticaRJ01.model.Categoria;
import com.getAll.PracticaRJ01.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {
	private final CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAll() {
		return categoriaRepository.findAll();
	}

}
