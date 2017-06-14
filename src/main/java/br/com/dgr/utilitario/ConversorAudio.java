package br.com.dgr.utilitario;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;

public class ConversorAudio {
	
	public void converteAudio(String caminhoAudioOrigem, String caminhoAudioConvertido, 
			String tipoAudioOrigem, String tipoAudioConvertido){
		File source = new File(caminhoAudioOrigem+"."+tipoAudioOrigem);
		File target = new File(caminhoAudioConvertido+"."+tipoAudioConvertido);
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame");
		audio.setBitRate(new Integer(128000));
		audio.setChannels(new Integer(2));
		audio.setSamplingRate(new Integer(44100));
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat(tipoAudioConvertido);
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		encoder.encode(source, target, attrs);
	}
}
