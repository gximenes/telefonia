package br.com.dgr.enuns;

public enum TipoPessoa {
	
	FISICA("F", "F�sica"),
	JURIDICA("J", "Jur�dica");
	
	
	private String valor;
	private String descricao;

	private TipoPessoa(String vl, String desc) {
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
