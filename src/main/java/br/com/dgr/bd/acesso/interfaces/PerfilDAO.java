package br.com.dgr.bd.acesso.interfaces;

import java.util.List;

import br.com.dgr.bd.entidades.Perfil;

public interface PerfilDAO {
	
	public List<Perfil> retornaTodosPerfis() throws Exception;

	public void alterarPerfil(Perfil perfil) throws Exception;
	
}
