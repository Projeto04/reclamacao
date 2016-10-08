package br.gov.sp.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.projeto.dao.ComentarioDAO;

@Service
public class ComentarioService {
	ComentarioDAO dao;

	@Autowired
	public ComentarioService(ComentarioDAO dao) {
		this.dao = dao;
	}
}