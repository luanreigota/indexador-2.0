package config;

import java.io.File;

public class SerializacaoConfig extends GenericSerialization{

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return new File("../indexado-2.0/src/main/java/config/config.xml");
	}
	
	
	
}
