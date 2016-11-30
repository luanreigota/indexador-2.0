package config;

import java.io.File;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;


public class GenericSerialization {

	public void inserir(String path, Object o){
		
		XStream xStream = new XStream();
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+xStream.toXML(o);
		System.out.println(xml);
		
		
		File arquivo = new File(path);
		FileOutputStream gravar;
		try {
			gravar = new FileOutputStream(arquivo);
			gravar.write(xml.getBytes());
			gravar.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
