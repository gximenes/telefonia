package br.com.dgr.enuns;

public enum Situacao {
	
	ATIVO("A", "Ativo"),
	INATIVO("I", "Inativo");
		
	private String valor;
	private String descricao;

	private Situacao(String vl, String desc) {
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
