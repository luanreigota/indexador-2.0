package config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.thoughtworks.xstream.XStream;

public abstract class GenericSerialization{

	protected final XStream xStream = new XStream();

	protected final String cabecalho = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";


	public final void inserir(Object o) throws IOException {
		String xml = cabecalho + "\n" + xStream.toXML(o);
		File arquivo = getFile();
		FileOutputStream gravar;
		gravar = new FileOutputStream(arquivo);
		gravar.write(xml.getBytes());
		gravar.close();
	}
	
	public final Object leitor() throws IOException{
		Object object = (Object) xStream.fromXML(getFile());
		return object;
	}


	
	public abstract File getFile();
	
}
