package br.com.dgr.enuns;

public enum Situacao {
	
	ATIVO('A', "Ativo"),
	INATIVO('I', "Inativo");
		
	private Character valor;
	private String descricao;

	private Situacao(Character vl, String desc) {
		this.valor = vl;
		this.descricao = desc;
	}

	public Character getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Situacao getSituacao(Character valor){
		for(Situacao st : Situacao.values()){
			if(st.getValor().equals(valor)){
				return st;
			}
		}
		return null;
	}
	
}
