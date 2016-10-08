package br.gov.sp.projeto.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.gov.sp.projeto.model.Usuario;

@Repository
public class UsuarioDAO {
	@PersistenceContext
	EntityManager manager;
	
	public void cadastar(Usuario user){
		manager.persist(user);
	}
	
	public void atualizar(Usuario user){
		manager.merge(manager.find(Usuario.class, user.getUsername()));
	}
	
	public Usuario selecionar( Usuario user){
		return manager.find( Usuario.class,  user.getId() );
	}
	
}
