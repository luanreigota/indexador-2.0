package config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

import entity.Config;

public class SerializacaoConfig {
	
	
	
	
	public void inserirConfig() {
		XStream xStream = new XStream();
		Config config = new Config("teste1", "teste2");
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+xStream.toXML(config);
		System.out.println(xml);
		
		
		File arquivo = new File("../indexado-2.0/src/main/java/config/config.xml");
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
	
	
	
	
	
	
	
	public static void leitor(String path) throws IOException {
		
		BufferedReader bReader = new BufferedReader(new FileReader(path));
		String linha = "";
		
		while (true) {
			if(linha!=null){
				System.out.println(linha);
			}else{
				break;
			}
			linha = bReader.readLine();
			
		}
		bReader.close();
		
	}
}
