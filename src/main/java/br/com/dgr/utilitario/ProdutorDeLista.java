package br.com.dgr.utilitario;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.com.dgr.enuns.Situacao;
import br.com.dgr.enuns.TipoAudio;
import br.com.dgr.enuns.TipoPessoa;

@ApplicationScoped
@ManagedBean
public class ProdutorDeLista {


	public List<SelectItem> getListaSituacaoSelectItem(){
		List<SelectItem> itens = new ArrayList<SelectItem>();
		for(Situacao st :Situacao.values()){
			itens.add(new SelectItem(st.getValor(),st.getDescricao()));
		}
		return itens;
	}

	public List<SelectItem> getListaTipoPessoaSelectItem(){
		List<SelectItem> itens = new ArrayList<SelectItem>();
		for(TipoPessoa st :TipoPessoa.values()){
			itens.add(new SelectItem(st.getValor(),st.getDescricao()));
		}
		return itens;
	}
	
	
	public List<SelectItem> getListaTipoPerfilSelectItem(){
		List<SelectItem> itens = new ArrayList<SelectItem>();
		for(TipoPessoa st :TipoPessoa.values()){
			itens.add(new SelectItem(st.getValor(),st.getDescricao()));
		}
		return itens;
	}
	
	public List<SelectItem> getListaTipoAudioSelectItem(){
		List<SelectItem> itens = new ArrayList<SelectItem>();
		for(TipoAudio st :TipoAudio.values()){
			itens.add(new SelectItem(st.getValor(),st.getDescricao()));
		}
		return itens;
	}


}
