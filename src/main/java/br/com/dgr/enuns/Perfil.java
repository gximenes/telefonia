package br.com.dgr.enuns;

public enum Perfil {   
	
	ADMINISTRADOR_GERAL("A", "ADMINISTRADOR GERAL"),
	FORNECEDOR("F", "FORNECEDOR");
	
	
	private String valor;
	private String descricao;

	private Perfil(String vl, String desc) {
		this.valor = vl;
		this.descricao = desc;
	}

	public String getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
