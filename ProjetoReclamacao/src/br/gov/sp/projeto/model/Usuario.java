package br.gov.sp.projeto.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;



@Entity
public class Usuario {
	/*
	 * @Transient informa para o hibernate 
	 * 		que este atributo nao deve ser persistido
	 */
	
	@Transient
	public static final int	CIDADAO 	= 0;
	
	@Transient
	public static final int	AVALIADOR 	= 1;
	
	@Transient
	public static final int SUPERVISOR 	= 2;
	
	@Transient
	public static final String 	MASCULINO 	= "MASCULINO";
	
	@Transient
	public static final String FEMININO 	= "FEMININO";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IdUsuario")
	private Long id;
	
	
	@Column(name="nmUsuario", length=128, nullable=false)
	@NotNull
	private String nome;
	
	@Column(length=15, nullable=false , unique = true )
	private String cpf;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length=10, nullable=false)
	private String sexo;
	
	@Column(length=30, nullable=false , unique = true )
	private String username;
	
	@Column(length=32, nullable=false)
	private String senha;
	
	@Column(nullable=false, length=1)
	private int tipo;
	
	@JoinColumn(name="idArea", nullable=false)
	@ManyToOne
	private Area area;
	
	/**
	 * CascadeType.ALL = generalização para persist, merge e remove - irá fazer as
	 * operações de forma automática no objeto referenciado
	 */
	@JoinColumn(name="idEndereco",nullable=false)
	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", username=" + username + ", senha=" + senha + ", tipo=" + tipo + ", area=" + area
				+ ", endereco=" + endereco  + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + tipo;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Usuario other = (Usuario) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (tipo != other.tipo)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
