package com.getAll.PracticaRJ01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.getAll.PracticaRJ01.service.ProductoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("producto")
public class ProductoController {

	private final ProductoService productoService;
	
	@GetMapping("listadoRJ")
	public String listado(Model model) {
		model.addAttribute("lstProductos", productoService.getAll());
		return "producto/listadoRJ";
	}
}
