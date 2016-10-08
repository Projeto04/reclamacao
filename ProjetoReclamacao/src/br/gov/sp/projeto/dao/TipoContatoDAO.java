package br.gov.sp.projeto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.gov.sp.projeto.model.Endereco;
import br.gov.sp.projeto.model.TipoContato;

@Repository
public class TipoContatoDAO {


	@PersistenceContext
	EntityManager manager;

	public void criar(TipoContato tipoContato){
		manager.persist(tipoContato);
	}
	
	public void atualizar(TipoContato tipoContato){
		manager.merge(tipoContato);
	}
	
	public void excluir(TipoContato tipoContato){
		manager.remove(manager.find(Endereco.class, tipoContato.getId()));
	}
	
	public TipoContato selecionar(int id){
		return manager.find(TipoContato.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoContato> listarTipoContato(){
		return manager.createQuery("select tc from TipoContato tc").getResultList();
	}
}


