package br.com.dgr.enuns;

public enum ElementoDeNavegacao {
	
	MANTER_USUARIO("Manter Usuário", "/paginas/privado/usuario.xhtml");
	
	private String valor;
	private String linkNavegacao;

	private ElementoDeNavegacao(String valor, String link) {
		this.valor = valor;
		this.linkNavegacao = link;
	}
	
	public String getLinkNavegacao() {
		return linkNavegacao;
	}


   public String getLinkNavegacaoByOpcao(ElementoDeNavegacao elemento){
	    for(ElementoDeNavegacao ele : ElementoDeNavegacao.values()){
	    	if(ele == elemento){
	    		return ele.getLinkNavegacao();
	    	}
	    }
	    return "";
   }
}
