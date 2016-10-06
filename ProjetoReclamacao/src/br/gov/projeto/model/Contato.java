package br.gov.projeto.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Contato {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@JoinColumn(nullable=false, name="idTipoContato")
	@OneToOne
	private TipoContato tipoContato;
	
	/**
	 * CascadeType.ALL = generalização para persist, merge e remove - irá fazer as
	 * operações de forma automática no objeto referenciado
	 */
	@JoinColumn(nullable=false, name="idUsuario")
	@OneToOne(cascade=CascadeType.ALL)
	private Usuario usuario;

	@Column(length = 256, nullable = false)
	private String valor;

	public TipoContato getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id= id;
	}

	@Override
	public String toString() {
		return "Contato [tipoContato=" + tipoContato + ", usuario=" + usuario + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipoContato == null) ? 0 : tipoContato.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoContato == null) {
			if (other.tipoContato != null)
				return false;
		} else if (!tipoContato.equals(other.tipoContato))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

}
