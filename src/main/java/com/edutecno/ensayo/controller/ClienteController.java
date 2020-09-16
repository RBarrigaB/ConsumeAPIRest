package com.edutecno.ensayo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.ensayo.model.Cliente;
import com.edutecno.ensayo.service.ClienteServicio;

@Controller
public class ClienteController {

	@Autowired
	ClienteServicio clienteservice;
	
	@RequestMapping("/list")
	public String findAll(ModelMap modelo){
		
		List<Cliente> dataClientes= new ArrayList<Cliente>();
		
		dataClientes = clienteservice.findAll();
		modelo.addAttribute("listaClientes", dataClientes);
		
		return "listarClientes";
	}
	
}
