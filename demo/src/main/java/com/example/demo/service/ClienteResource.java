package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;

@RestController
public class ClienteResource {

	@GetMapping("/Cliente")
	public List<Cliente> listarClientes(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Juliano");
		cliente1.setEmail("juliano@email.com");
		cliente1.setTelefone(null);
		cliente1.setcpf(null);
		cliente1.setAtivo(null);
		return Arrays.asList(cliente1);
	}

}
