package br.com.dgr.view.managedbean;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.UploadedFile;

import br.com.dgr.enuns.TipoAudio;
import br.com.dgr.utilitario.ConversorAudio;

@ManagedBean
public class ConverterAudioManagedBean {

	private TipoAudio tipoAudioOrigem;
	private TipoAudio tipoAudioConvertido;
	private UploadedFile uploadFile;

	public void converterAudio() throws IOException {
		File file = convertUploadedFileToFile();		
		String caminhoAudioConvertido = "";
		ConversorAudio.converteAudio(file, caminhoAudioConvertido,
				this.tipoAudioOrigem.getDescricao(), this.tipoAudioConvertido.getDescricao());
	}

	private File convertUploadedFileToFile() throws IOException {
		InputStreamReader reader = new InputStreamReader(this.uploadFile.getInputstream());
		int partition = 1024;
		int length = 0;
		int position = 0;
		char[] buffer = new char[partition];
		FileWriter fstream = new FileWriter("out."+this.tipoAudioOrigem);
		do{
		    length = reader.read(buffer, position, partition);
		    fstream.write(buffer, position, length);
		}while(length > 0);
		File file = new File("out."+this.tipoAudioOrigem);
		return file;
	}

	public TipoAudio getTipoAudioOrigem() {
		return tipoAudioOrigem;
	}

	public void setTipoAudioOrigem(TipoAudio tipoAudioOrigem) {
		this.tipoAudioOrigem = tipoAudioOrigem;
	}

	public TipoAudio getTipoAudioConvertido() {
		return tipoAudioConvertido;
	}

	public void setTipoAudioConvertido(TipoAudio tipoAudioConvertido) {
		this.tipoAudioConvertido = tipoAudioConvertido;
	}
}
