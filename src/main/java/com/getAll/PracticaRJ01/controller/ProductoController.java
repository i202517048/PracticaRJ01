package com.getAll.PracticaRJ01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.getAll.PracticaRJ01.service.CategoriaService;
import com.getAll.PracticaRJ01.service.ProductoService;
import com.getAll.PracticaRJ01.service.ProveedorService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("producto")
public class ProductoController {

	private final ProductoService productoService;
	private final CategoriaService categoriaService;
	private final ProveedorService proveedorService;
	
	@GetMapping("listadoRJ")
	public String listado(Model model) {
		model.addAttribute("lstProductos", productoService.getAll());
		return "producto/listadoRJ";
	}
	
	@GetMapping("nuevoRJ")
	public String nuevo(Model model) {
			model.addAttribute("lstCategorias", categoriaService.getAll());
			model.addAttribute("lstProveedores", proveedorService.getAll());
		return "producto/nuevoRJ";
	}
	
	
}
