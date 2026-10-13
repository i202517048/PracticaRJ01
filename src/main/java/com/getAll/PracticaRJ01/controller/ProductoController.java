package com.getAll.PracticaRJ01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.getAll.PracticaRJ01.model.Producto;
import com.getAll.PracticaRJ01.service.CategoriaService;
import com.getAll.PracticaRJ01.service.ProductoService;
import com.getAll.PracticaRJ01.service.ProveedorService;
import com.getAll.PracticaRJ01.util.Alert;

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
			//Creacion del objeto producto para que el html pueda realizar la acción registrar
			model.addAttribute("producto", new Producto());
		return "producto/nuevoRJ";
	}
	
	
	// Método para crear un registro	
	@PostMapping("registrar")
	public String registrar(@ModelAttribute Producto producto, RedirectAttributes flash) {
		var response = productoService.create(producto);
		var alert = Alert.sweetToast(response.mensaje(), "success", 5000);
		
		flash.addFlashAttribute("alert", alert);
		
		return "redirect:/producto/listadoRJ";
	}
	
	
}
