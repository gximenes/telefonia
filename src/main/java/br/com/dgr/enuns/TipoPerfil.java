package br.com.dgr.enuns;

public enum TipoPerfil {   
	
	ADMINISTRADOR_GERAL('A', "ADMINISTRADOR GERAL"),
	FORNECEDOR('F', "FORNECEDOR");
	
	
	private Character valor;
	private String descricao;

	private TipoPerfil(Character vl, String desc) {
		this.valor = vl;
		this.descricao = desc;
	}

	public Character getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoPerfil getPerfil(Character valor){
		for(TipoPerfil pf : TipoPerfil.values()){
			if(pf.getValor().equals(valor)){
				return pf;
			}
		}
		return null;
	}
	
}
