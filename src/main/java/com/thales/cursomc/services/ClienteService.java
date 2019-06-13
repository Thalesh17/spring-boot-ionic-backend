package com.thales.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thales.cursomc.domain.Cliente;
import com.thales.cursomc.repositories.ClienteRepository;
import com.thales.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id + 
					", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}
