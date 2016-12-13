package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MainTeste {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("/home/luan/bkp-portal-cmrj/admin/include/class/list_admin.php");
		
		try (InputStream stream = Files.newInputStream(arquivo.toPath())) {
			

			 new BufferedReader(new InputStreamReader(stream,
			 StandardCharsets.ISO_8859_1));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
