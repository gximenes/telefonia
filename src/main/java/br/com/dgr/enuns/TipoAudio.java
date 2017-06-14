package br.com.dgr.enuns;

public enum TipoAudio {   
	
	MP3("mp3", "MP3"),
	WAV("wav", "WAV"),
	MP4("mp4","MP4");
	
	
	private String valor;
	private String descricao;

	private TipoAudio(String vl, String desc) {
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
