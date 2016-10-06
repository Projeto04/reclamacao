package br.gov.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.projeto.DAO.ComentarioDAO;

@Service
public class ComentarioService {
	ComentarioDAO dao;

	@Autowired
	public ComentarioService(ComentarioDAO dao) {
		this.dao = dao;
	}
}