package br.com.dgr.bd.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.dgr.enuns.Situacao;
import br.com.dgr.enuns.TipoPerfil;


@Entity
@Table(name = "\"TB_PERFIL\"" , schema = "\"TELEFONIA\"")
public class Perfil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "\"ID_PERFIL\"" )
	private Long id;
	

	@Column(name = "\"TP_PERFIL\"" )
	private Character tipoPerfil;


	@Column(name = "\"ST_SITUACAO\"" )
	private Character situacao;


	public Perfil(Long idPerfil) {
		this.setId(idPerfil);
	}
	
	public Perfil() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Character getSituacao() {
		return situacao;
	}

	public void setSituacao(Character situacao) {
		this.situacao = situacao;
	}

	public Character getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(Character tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}
	
	public String getDescricaoSituacao(){
		return Situacao.getSituacao(this.getSituacao()).getDescricao();
	}

	public String getDescricaoPerfil(){
		return TipoPerfil.getPerfil(this.getTipoPerfil()).getDescricao();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
		result = prime * result + ((tipoPerfil == null) ? 0 : tipoPerfil.hashCode());
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
		Perfil other = (Perfil) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		if (tipoPerfil == null) {
			if (other.tipoPerfil != null)
				return false;
		} else if (!tipoPerfil.equals(other.tipoPerfil))
			return false;
		return true;
	}

}
