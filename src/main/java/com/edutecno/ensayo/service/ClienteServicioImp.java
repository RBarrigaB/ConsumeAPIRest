package com.edutecno.ensayo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutecno.ensayo.model.Cliente;


@Service
public class ClienteServicioImp implements ClienteServicio{

	RestTemplate restTemplate;
	
	@Autowired
	public ClienteServicioImp(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Cliente> findAll() {
	
		ResponseEntity<Cliente[]> respuesta = restTemplate.getForEntity("http://localhost:8080/api/v1/listadoClientes", Cliente[].class);
		List<Cliente> listado= Arrays.asList(respuesta.getBody());
		return listado;
	}
	
	
}
