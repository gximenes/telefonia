package br.com.dgr.utilitario;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;

public class ConversorAudio {
	
	/** Para esta classe funcionar, deve ser criada uma nova dependência
	 * no arquivo pom.xml
	 * mvn install:install-file -Dfile=C:\jave-1.0.2.jar 
	 * -DgroupId=org.br.conversor -DartifactId=conversor 
	 * -Dversion=1.0.2 -Dpackaging=jar -DgeneratePom=true
	 */
	
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
		try {
			encoder.encode(source, target, attrs);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InputFormatException e) {
			e.printStackTrace();
		} catch (EncoderException e) {
			e.printStackTrace();
		}
	}
}
