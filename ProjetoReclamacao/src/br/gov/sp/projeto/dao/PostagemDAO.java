package br.gov.sp.projeto.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.gov.sp.projeto.model.Postagem;

@Repository
public class PostagemDAO {
	@PersistenceContext
	EntityManager manager;
	
	
	public void criar(Postagem post){
		manager.persist(post);
	}
	
	public void atualizar(Postagem post){
		manager.merge(manager.find(Postagem.class, post.getId()));
	}
	
	public void excluir(Postagem post){
		manager.remove(manager.find(Postagem.class, post.getId()));
	}
	
	public Postagem selecionar(String id){
		return manager.find(Postagem.class, id);
	}
}
