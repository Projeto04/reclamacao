package br.gov.sp.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.projeto.dao.UsuarioDAO;
import br.gov.sp.projeto.model.Usuario;


@Service
public  class UsuarioService {
	private UsuarioDAO dao;
	
	@Autowired
	public UsuarioService( UsuarioDAO dao ) {
		this.dao = dao;
	}


	public  void cadastrar(Usuario user){
		dao.cadastar(user);
	}

	
	public void atualizar(Usuario user){
		dao.atualizar(user);
	}


	public Usuario buscar(Usuario user) {
		
		return dao.selecionar( user );
	}

}
