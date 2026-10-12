package com.getAll.PracticaRJ01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getAll.PracticaRJ01.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	List<Producto> findAllByOrderByIdProductoDesc();

}
