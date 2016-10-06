package br.gov.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.projeto.DAO.PostagemDAO;

@Service
public class PostagemService {
	PostagemDAO dao;

	@Autowired
	public PostagemService(PostagemDAO dao) {
		this.dao = dao;
	}
}
