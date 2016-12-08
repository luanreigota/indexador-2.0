package main;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;



public class MainTeste {

	public static void main(String[] args) throws IOException {
		
//		List<Extensoes> extensoes = new ArrayList<>();
//		extensoes.add(new Extensoes(".php"));
//		extensoes.add(new Extensoes(".pdf"));
		
//		Config config = (Config) new SerializacaoConfig().leitor();
//		System.out.println(config.getPathIndexar());
//		System.out.println(config.getPathIndice());
//		
//		new SerializacaoConfig().alterarPathIndice("novo indice");
//		Config config2 = (Config) new SerializacaoConfig().leitor();
//		System.out.println(config2.getPathIndexar());
//		System.out.println(config2.getPathIndice());
//		new SerializacaoExtensoes().addExtensao(".html");
		
		
//		new SerializacaoExtensoes().removerExtensao(0);
//		List<Extensoes> extensoes = (List<Extensoes>) new SerializacaoExtensoes().leitor();
		
		
//		for (Extensoes extensoes2 : extensoes) {
//			System.out.println(extensoes2.getExtensao());
//		}
		
//		new GenericSerialization().inserir("../indexado-2.0/src/main/java/config/extensoes.xml", extensoes);
//		new GenericSerialization().inserir("../indexado-2.0/src/main/java/config/config.xml", new Config("teste1", "teste2"));
		
//		new SerializacaoConfig().inserirConfig();
//		new SerializacaoExtensoes().inserirExtensao();
//		new ManipuladorConfig().leitor("../indexado-2.0/src/main/java/config/config.xml");
		
		
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
		});
		
	}
}


