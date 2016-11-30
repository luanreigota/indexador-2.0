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


