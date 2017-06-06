package br.com.dgr.view.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dgr.bd.entidades.Usuario;

@ManagedBean
@ViewScoped
public class ManterUsuarioManagedBean {
    
	private List<Usuario> usuariosPesquisados;
	private Usuario usuarioConsulta;
	
	public void init(){
		setUsuarioConsulta(new Usuario());
		setUsuariosPesquisados(new ArrayList<Usuario>());
	}

	public List<Usuario> getUsuariosPesquisados() {
		return usuariosPesquisados;
	}

	public void setUsuariosPesquisados(List<Usuario> usuariosPesquisados) {
		this.usuariosPesquisados = usuariosPesquisados;
	}

	public Usuario getUsuarioConsulta() {
		return usuarioConsulta;
	}

	public void setUsuarioConsulta(Usuario usuarioConsulta) {
		this.usuarioConsulta = usuarioConsulta;
	}
	
	
	
	
}
