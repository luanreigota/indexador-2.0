package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import config.GenericSerialization;
import entity.Config;
import entity.Extensoes;



public class MainTeste {

	public static void main(String[] args) throws IOException {
		
		List<Extensoes> extensoes = new ArrayList<>();
		extensoes.add(new Extensoes(".php"));
		extensoes.add(new Extensoes(".pdf"));
		
		new GenericSerialization().inserir("../indexado-2.0/src/main/java/config/extensoes.xml", extensoes);
		new GenericSerialization().inserir("../indexado-2.0/src/main/java/config/config.xml", new Config("teste1", "teste2"));
		
//		new SerializacaoConfig().inserirConfig();
//		new SerializacaoExtensoes().inserirExtensao();
//		new ManipuladorConfig().leitor("../indexado-2.0/src/main/java/config/config.xml");
		
		/*
		Path path = Paths.get(System.getProperty("user.home")+"/bkp-portal-cmrj");
		Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
		
			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				// TODO Auto-generated method stub
				System.out.println("pasta: "+ dir.toString());
				return super.postVisitDirectory(dir, exc);
			}
			
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				// TODO Auto-generated method stub
				return super.visitFile(file, attrs);
			}
		});*/
		
	}
}


