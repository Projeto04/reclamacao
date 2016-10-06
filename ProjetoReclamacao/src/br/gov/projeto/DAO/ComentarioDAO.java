package br.gov.projeto.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.gov.projeto.model.Comentario;

@Repository
public class ComentarioDAO {
	@PersistenceContext
	EntityManager manager;

	public void criar(Comentario comentario) {
		manager.persist(comentario);
	}

	public void atualizar(Comentario comentario) {
		manager.merge(manager.find(Comentario.class, comentario.getId()));
	}

	public void excluir(Comentario comentario) {
		manager.remove(manager.find(Comentario.class, comentario.getId()));
	}

	public Comentario selecionar(String id) {
		return manager.find(Comentario.class, id);
	}
}
