package com.getAll.PracticaRJ01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.getAll.PracticaRJ01.model.Proveedor;
import com.getAll.PracticaRJ01.repository.ProveedorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProveedorService {
	private final ProveedorRepository proveedorRepository;
	
	public List<Proveedor> getAll() {
		return proveedorRepository.findAll();
		}

}
