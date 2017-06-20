package br.com.dgr.view.managedbean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.dgr.bd.acesso.implementacoes.PerfilImpDAO;
import br.com.dgr.bd.entidades.Perfil;
import br.com.dgr.enuns.ElementoDeNavegacao;

@ManagedBean
@SessionScoped
public class ManterPerfilManagedBean {
    
	private List<Perfil> perfis;
	private Perfil perfil;
	
	//@Inject
	//private PerfilImpDAO perfilDAO;
	
	
	public String getInit(){
		PerfilImpDAO perfilDAO = new PerfilImpDAO();
		try{
			setPerfil(new Perfil());
			setPerfis(perfilDAO.retornaTodosPerfis());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return ElementoDeNavegacao.MANTER_PERFIL.getLinkNavegacao();
	}
	
	public String alterarPerfil(Perfil perfil){
		try {
			PerfilImpDAO perfilDAO = new PerfilImpDAO();
			perfil.setSituacao(perfil.getSituacao() == 'A' ? 'I' : 'A');
			perfilDAO.alterarPerfil(perfil);
			FacesContext.getCurrentInstance().addMessage
			 (null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Perfil alterado com sucesso.", ""));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return getInit();
	}
	
	public boolean isPerfilAtivo(char valor){
		if(valor == 'A'){
			return true;
		}else{
			return false;
		}
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
