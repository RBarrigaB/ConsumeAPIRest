package com.edutecno.ensayo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	private String id_cliente;
	private String nombreCompania;
	private String nombreContacto;
	private String tituloContacto;
	private String direccion;
	private String ciudad;
	private String region;
	private String codigoPostal;
	private String pais;
	private String telefono;
	private String mail;
	private String clave;
}
