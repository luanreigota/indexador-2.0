package indexator;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.List;

import entity.Arquivo;

public class FileAnalyzer extends SimpleFileVisitor<Path> {

	private Indexador indexador;

	private List<String> acceptExtensions;

	public FileAnalyzer(Indexador indexador, List<String> acceptExtensions) {
		// TODO Auto-generated constructor stub
		this.indexador = indexador;
		this.acceptExtensions = acceptExtensions;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
		
		if(accept(file.toFile())){
			Arquivo arquivo = new Arquivo(file.toFile());
			indexador.indexarArquivo(arquivo);
			System.out.println(file.toString());
		}
		
		return super.visitFile(file, attrs);
	}

	public boolean accept(File file) {
		boolean accept = false;
		if (acceptExtensions.size() == 0) {
			accept = true;
		} else {
			for (String extension : acceptExtensions) {
				if (file.getName().toLowerCase().endsWith(extension)) {
					accept = true;
					break;
				}
			}
		}
		return accept;
	}

}
