package com.avaliacao.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.avaliacao.Entity.Cliente;
import com.avaliacao.Repository.ClienteRepository;

import jakarta.validation.Valid;

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
@Autowired
public ClienteService (ClienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
}

@GetMapping
public List<Cliente> buscaTodosClientes(){
	return buscaTodosClientes();
}

@GetMapping("/{id}")
public boolean buscaClienteControlId(@PathVariable Long id){
	Cliente cliente = clienteService.buscaClienteId(id);
	if(cliente != null) {
		return false;
	}
	else {
		return true;
	}
}

@PostMapping
public List<Cliente> InserirCliente(@PathVariable @Valid Cliente cliente){
	Cliente cliente = clienteService.inserirCliente();
}


@PutMapping("/{id}")
public List<Cliente> alterarClienteControlId(@PathVariable Long id, @PathVariable @Valid Cliente cliente){
	Cliente alterarCliente = clienteService.alterarCliente(id);
		if(alterarCliente != null) {
			return ResponseEntity.alterarCliente();
		}
		else {
			return ResponseEntity.notFound().build();
	}
}

@DeleteMapping("/{id}")
//	Não Lembro
}