package com.getAll.PracticaRJ01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_proveedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proveedor")
	private Integer idProveedor;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "email")
	private String email;

}
