package br.com.dgr.bd.entidades;

import java.util.Date;

public class Usuario {
	
	private Long id;
	
	private String  nomeDescricao;
	
	private String status;
	
	private Date dataCriacao;
	
	private String perfil;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	

	public String getNomeDescricao() {
		return nomeDescricao;
	}

	public void setNomeDescricao(String nomeDescricao) {
		this.nomeDescricao = nomeDescricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
}
