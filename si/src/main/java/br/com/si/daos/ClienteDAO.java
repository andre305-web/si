package br.com.si.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.si.models.Cliente;

/*Pode usar '@Component'.Permite que a classe sejá gerenciada pelo stping,
mas usa-se mais 'Repository' por questão de semántica*/
@Repository // Herda de Componet
@Transactional // Identifica que será transacional
public class ClienteDAO {

	@PersistenceContext
	private EntityManager manager;

	public void gravar(Cliente cliente) {
		manager.persist(cliente);
	}
}
