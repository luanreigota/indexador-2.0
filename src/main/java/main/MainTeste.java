package main;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainTeste {

	public static void main(String[] args) throws IOException {
		
		List<String> tipos = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		
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
				System.out.println("arquivo: "+file.toString());
				System.out.println("mime type: "+Files.probeContentType(file));
				String tipo = Files.probeContentType(file);
				if(!tipos.contains(tipo)){
					tipos.add(Files.probeContentType(file));
					nomes.add(file.toString());
				}
				return super.visitFile(file, attrs);
			}
		});
		System.out.println("================================================");
		for (int i=0; i<tipos.size(); i++) {
			System.out.println(tipos.get(i)+"						| "+nomes.get(i));
		}
		
	}
}


