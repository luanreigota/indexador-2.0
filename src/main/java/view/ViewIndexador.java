package view;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.List;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import actions.SelectPasta;
import config.SerializacaoConfig;
import config.SerializacaoExtensoes;
import entity.Config;
import entity.Extensoes;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ViewIndexador extends JInternalFrame {
	private JTextField pastaPIndexar;
	private JTextField pastapIndice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewIndexador frame = new ViewIndexador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 * @throws IOException 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ViewIndexador() throws PropertyVetoException, IOException {
		setTitle("Indexador");
		setMaximizable(true);
		setClosable(true);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		Config config = (Config) new SerializacaoConfig().leitor();
		
		JPanel diretorios = new JPanel();
		getContentPane().add(diretorios);
		diretorios.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel indexar = new JPanel();
		diretorios.add(indexar);
		indexar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblIndexar = new JLabel("Indexar: ");
		indexar.add(lblIndexar);
		
		pastaPIndexar = new JTextField();
		pastaPIndexar.setText(config.getPathIndexar());
		indexar.add(pastaPIndexar);
		pastaPIndexar.setColumns(30);
		
		JButton selectPastaIndexar = new JButton("");
		selectPastaIndexar.addActionListener(new SelectPasta(pastaPIndexar));
		selectPastaIndexar.setIcon(new ImageIcon(ViewIndexador.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		indexar.add(selectPastaIndexar);
		
		JPanel indice = new JPanel();
		diretorios.add(indice);
		
		JLabel lblIndice = new JLabel("Indice: ");
		indice.add(lblIndice);
		
		pastapIndice = new JTextField();
		pastapIndice.setText(config.getPathIndice());
		indice.add(pastapIndice);
		pastapIndice.setColumns(30);
		
		JButton selectPastaIndice = new JButton("");
		selectPastaIndice.addActionListener(new SelectPasta(pastapIndice));
		selectPastaIndice.setIcon(new ImageIcon(ViewIndexador.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		indice.add(selectPastaIndice);
		
		JPanel extensoes = new JPanel();
		getContentPane().add(extensoes);
		extensoes.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panelExtensoes = new JPanel();
		extensoes.add(panelExtensoes);
		DefaultListModel<String> model = new DefaultListModel<>();
		
		for (Extensoes e : ((List<Extensoes>) new SerializacaoExtensoes().leitor())) {
			model.addElement(e.getExtensao());
		}
		JScrollPane scrollPaneExtensoes = new JScrollPane();
		scrollPaneExtensoes.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panelExtensoes.add(scrollPaneExtensoes);
		
		JList listExtensoes = new JList();
		listExtensoes.setModel(model);
		scrollPaneExtensoes.setViewportView(listExtensoes);
		
		JPanel botoes = new JPanel();
		extensoes.add(botoes);
		
		JButton ok = new JButton("ok");
		ok.setVerticalAlignment(SwingConstants.BOTTOM);
		botoes.add(ok);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botoes.add(cancelar);
		setBounds(0, 0, 850, 400);

	}
}
