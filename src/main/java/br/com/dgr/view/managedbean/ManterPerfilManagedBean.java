package br.com.dgr.view.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dgr.bd.entidades.Perfil;
import br.com.dgr.enuns.ElementoDeNavegacao;

@ManagedBean
@SessionScoped
public class ManterPerfilManagedBean {
    
	private List<Perfil> perfis;
	private Perfil perfil;
	
	
	public String getInit(){
		setPerfil(new Perfil());
		setPerfis(new ArrayList<Perfil>());
		
		return ElementoDeNavegacao.MANTER_PERFIL.getLinkNavegacao();
	}


	public List<Perfil> getPerfis() {
		return perfis;
	}


	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}


	public Perfil getPerfil() {
		return perfil;
	}


	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
	
	
}
