package br.com.dgr.enuns;

public enum ElementoDeNavegacao {
	
	MANTER_USUARIO("Manter Usuário", "/paginas/privado/usuario/consultarUsuario.xhtml",null),
		INCLUIR_USUARIO("Manter Usuário", "/paginas/privado/usuario/incluirUsuario.xhtml", MANTER_USUARIO);
	
	private String valor;
	private String linkNavegacao;
	private ElementoDeNavegacao dependenciaSuperior;

	private ElementoDeNavegacao(String valor, String link, ElementoDeNavegacao dependenciaSuperior) {
		this.valor = valor;
		this.linkNavegacao = link;
		this.dependenciaSuperior = dependenciaSuperior;
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
