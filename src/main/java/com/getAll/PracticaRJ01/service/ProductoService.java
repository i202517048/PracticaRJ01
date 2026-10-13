package com.getAll.PracticaRJ01.service;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.getAll.PracticaRJ01.dto.ResultadoResponse;
import com.getAll.PracticaRJ01.model.Producto;
import com.getAll.PracticaRJ01.repository.ProductoRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
	
	private final ProductoRepository productoRepository;
	
	// Método Listar
	public List<Producto> getAll() {
		return productoRepository.findAllByOrderByIdProductoDesc();
	}
	
	
	// Método para crear registro
	@Transactional
	public ResultadoResponse create(Producto producto) {
		try {
			var registrado = productoRepository.save(producto);
			var mensaje = String.format("Producto Nro %s registrado", registrado.getIdProducto());
			
			return new ResultadoResponse(true, mensaje);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultadoResponse(false, "Hubo un error en la transacción.");
		}
		
	}

		
	
	
}
