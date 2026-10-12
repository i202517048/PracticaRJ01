package com.getAll.PracticaRJ01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.getAll.PracticaRJ01.model.Producto;
import com.getAll.PracticaRJ01.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
	
	private final ProductoRepository productoRepository;
	
	public List<Producto> getAll() {
		return productoRepository.findAllByOrderByIdProductoDesc();
	}

}
