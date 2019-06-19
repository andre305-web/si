package br.com.si.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.si.daos.ClienteDAO;
import br.com.si.models.Cliente;

@Controller
public class ClientesController {
	
	//Acesso ao BD
	@Autowired //Usa-se Autowired para 'injetar' o ProdutoDao
	public ClienteDAO clienteDao;

	@RequestMapping("/clientes/form")
	public String form() {
		return "clientes/form";
	}

	@RequestMapping("/clientes")
	public String gravar(Cliente cliente) {
		System.out.println(cliente);
		clienteDao.gravar(cliente);
		return "clientes/ok";
	}
}
