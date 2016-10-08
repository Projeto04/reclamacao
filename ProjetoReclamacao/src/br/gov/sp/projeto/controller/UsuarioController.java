package br.gov.sp.projeto.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.sp.projeto.model.Usuario;
import br.gov.sp.projeto.service.UsuarioService;
/**
 * 
 * @author Azazel
 *
 */
@Transactional
@Controller
public class UsuarioController {
	private UsuarioService userService;
	
	@Autowired
	public UsuarioController(UsuarioService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("formBuscaCidadao")
	public String formBuscaCidadao(){
		return "buscarUsuario";
	}
	
	@RequestMapping("buscarUsuario")
	public String buscarUsuario( Usuario user , Model model ){
		user =  userService.buscar(user); 
		
		model.addAttribute("user", user );
		
		return "ok";
	}
	
	
	@RequestMapping("cadastroCidadao")
	public String cadastroCidadao( Usuario user , Model model  ){
		user.setTipo( Usuario.CIDADAO );
		//user.setDataNascimento( Calendar.getInstance() );
		userService.cadastrar(user);
		
		model.addAttribute("user", user );
		return "ok";
	}
	
}
