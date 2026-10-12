package com.getAll.PracticaRJ01.model;

import java.math.BigDecimal;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_producto")
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "stock")
	private Integer stock;
	
	@Column(name = "precio")
	private BigDecimal precio;
	
	@Column(name = "activo")
	private Boolean activo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor")
	private Proveedor proveedor;
	
	public String getActivoDescripcion() {
		return activo ? "Activo" : "Inactivo";
	}
	
}
