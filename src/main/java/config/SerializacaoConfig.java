package config;

import java.io.File;
import java.io.IOException;

import entity.Config;

public class SerializacaoConfig extends GenericSerialization{

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return new File(getClass().getResource("config.xml").getPath());
	}
	
	public void alterarPathIndice(String newPathIndice) throws IOException {
		// TODO Auto-generated method stub
		Config config = (Config)leitor();
		config.setPathIndice(newPathIndice);
		inserir(config);
	}
	
	public void alterarPathIndexar(String newPathIndexar) throws IOException {
		// TODO Auto-generated method stub
		Config config = (Config)leitor();
		config.setPathIndice(newPathIndexar);
		inserir(config);
	}
	
}
