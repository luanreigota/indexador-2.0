package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JButton;

public class Principal {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);

		JMenuBar menuBar = getMyJMenuBar(desktopPane);
		desktopPane.setLayout(null);

		JPanel pesquisa = new JPanel();
		pesquisa.setBounds(12, 30, 876, 73);
		desktopPane.add(pesquisa);
		pesquisa.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Label pesquisar = new Label("Pesquisar: ");
		pesquisa.add(pesquisar);
		
		TextField textPesquisar = new TextField();
		textPesquisar.setColumns(30);
		pesquisa.add(textPesquisar);
		
		JButton ok = new JButton("OK");
		pesquisa.add(ok);

		JPanel resultado = new JPanel();
		resultado.setBounds(12, 115, 876, 324);
		desktopPane.add(resultado);

		String[] columnNames = {"teste1", "teste2"};
		
		String[][] data = {{"teste1", "teste1"}, {"teste2", "teste2"}};
		
		table = new JTable(data, columnNames);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);

//		@SuppressWarnings("serial")
//		DefaultTableModel model = new DefaultTableModel() {
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
//
//		model.addColumn("teste1");
//		model.addColumn("teste2");
//		
//		model.addRow(new Object[] { "t2", "t2" });
//
//		table.setModel(model);
		resultado.add(table);
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
	}

	private JMenuBar getMyJMenuBar(JDesktopPane desktopPane) {
		JMenuBar menuBar = new JMenuBar();
		JMenu arquivo = new JMenu("Arquivo");
		menuBar.add(arquivo);

		JMenuItem indexar = new JMenuItem("Indexar");
		indexar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					ViewIndexador indexador = new ViewIndexador();
					indexador.setName("ViewIndexador");
					indexador.setVisible(true);
					desktopPane.add(indexador);
					indexador.setSelected(true);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		arquivo.add(indexar);

		JMenuItem extensao = new JMenuItem("Extensão");
		arquivo.add(extensao);

		JMenuItem indice = new JMenuItem("indice");
		menuBar.add(indice);
		return menuBar;
	}
}
