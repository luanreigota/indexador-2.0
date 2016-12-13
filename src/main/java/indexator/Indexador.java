package indexator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import entity.Arquivo;

public class Indexador {

	private IndexWriter writer;

	public Indexador(String diretorioDosIndices) {
		try {
			Directory doc = FSDirectory.open(Paths.get(diretorioDosIndices));
			Analyzer analyzer = new StandardAnalyzer();
			IndexWriterConfig iwc = new IndexWriterConfig(analyzer);

			iwc.setOpenMode(OpenMode.CREATE);

			writer = new IndexWriter(doc, iwc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void indexarArquivo(Arquivo arquivo) throws IOException {

		Document document = new Document();
		document.add(getUltimaModificacao(arquivo));
		document.add(getCaminho(arquivo));
		document.add(getNome(arquivo));
		document.add(getConteudo(arquivo));

		try {
			writer.addDocument(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private TextField getUltimaModificacao(Arquivo arquivo) {
		return new TextField("ultimamodificacao", arquivo.getUltimaModificacao(), Store.YES);
	}

	private TextField getCaminho(Arquivo arquivo) {
		return new TextField("caminho", arquivo.getCaminho(), Store.YES);
	}

	private TextField getNome(Arquivo arquivo) {
		return new TextField("nome", arquivo.getNome(), Store.YES);
	}

	private TextField getConteudo(Arquivo arquivo) throws IOException {
		File file = new File(arquivo.getCaminho());
		InputStream stream = Files.newInputStream(file.toPath()); 
		return new TextField("texto",
				 new BufferedReader(new InputStreamReader(stream,
						 StandardCharsets.ISO_8859_1)));
	}

	public void close() throws IOException {
		writer.close();
	}

}
