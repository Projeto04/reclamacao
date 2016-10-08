package br.gov.sp.projeto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.gov.sp.projeto.model.Area;
import br.gov.sp.projeto.model.Contato;

@Repository
public class ContatoDAO {

		@PersistenceContext
		EntityManager manager;

		public void criar(Contato contato){
			manager.persist(contato);
		}
		
		public void atualizar(Contato contato){
			manager.merge(contato);
		}
		
		public void excluir(Contato contato){
			manager.remove(manager.find(Area.class, contato.getId()));
		}
		
		public Contato selecionar(int id){
			return manager.find(Contato.class, id);
		}
		
		@SuppressWarnings("unchecked")
		public List<Contato> listarContato(){
			return manager.createQuery("select c from Contato c").getResultList();
		}
}
