package actions;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import config.SerializacaoConfig;
import entity.Config;
import indexator.FileAnalyzer;
import indexator.Indexador;
import view.ViewIndexador;

public class Indexar implements ActionListener{

	private JTextField pastaPIndexar;
	
	private JTextField pastaPIndice;
	
	@SuppressWarnings("rawtypes")
	private JList extensoes;
	
	@SuppressWarnings("rawtypes")
	public Indexar(JTextField pastaPIndexar, JTextField pastaPIndice, JList extensoes) {
		super();
		this.pastaPIndexar = pastaPIndexar;
		this.pastaPIndice = pastaPIndice;
		this.extensoes = extensoes;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Indexador indexador = new Indexador(pastaPIndice.getText());
			Config config = new Config(pastaPIndice.getText(), pastaPIndexar.getText());
			SerializacaoConfig serializacaoConfig = new SerializacaoConfig();
			serializacaoConfig.inserir(config);
//			FileAnalyzer fileAnalyzer = new FileAnalyzer(indexador, extensoes.getSelectedValuesList());
//			Files.walkFileTree(Paths.get(pastaPIndexar.getText()), fileAnalyzer);
			indexador.close();
			Component component = (Component) e.getSource();
			JFrame frame = (JFrame) SwingUtilities.getRoot(component);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
