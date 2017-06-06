package br.com.dgr.view.managedbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.dgr.bd.entidades.Usuario;
import br.com.dgr.enuns.ElementoDeNavegacao;

@ManagedBean
@SessionScoped
public class ManterUsuarioManagedBean {
    
	private List<Usuario> usuariosPesquisados;
	private Usuario usuarioConsulta;
	
	@PostConstruct
	public String getInit(){
		setUsuarioConsulta(new Usuario());
		setUsuariosPesquisados(new ArrayList<Usuario>());
		
		return ElementoDeNavegacao.MANTER_USUARIO.getLinkNavegacao();
	}
	
	public String consultar(){
		
		setUsuariosPesquisados(users());
		
		return ElementoDeNavegacao.MANTER_USUARIO.getLinkNavegacao();
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
	
	//*********MOCK
	private List<Usuario> users(){
		List<Usuario> users = new ArrayList<Usuario>();
		for(int aux = 0 ; aux<10 ; aux++){
			Usuario user = new Usuario();
			user.setId(Long.valueOf(String.valueOf(aux)));
			user.setDataCriacao(new Date());
			user.setNomeDescricao("Teste "+aux);
			user.setPerfil("Perfil Teste "+aux );

			user.setStatus("Ativo");
			
			users.add(user);
			
		}
		
		return users;
	}
	
	
}
