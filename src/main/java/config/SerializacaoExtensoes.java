package config;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import entity.Extensoes;

public class SerializacaoExtensoes {

	public void inserirExtensao() {
		XStream xStream = new XStream();
		
		List<Extensoes> extensoes = new ArrayList<>();
		extensoes.add(new Extensoes(".php"));
		extensoes.add(new Extensoes(".pdf"));
		
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+xStream.toXML(extensoes);
		System.out.println(xml);
	}
	
	
}
