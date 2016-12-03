package view;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;import java.awt.MenuBar;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Principal extends JFrame{
	public static void main(String[] args) {
		new Principal("Indexador 2.0");
	}
	public Principal(String title){
		super(title);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(300, 300);
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		desktopPane.add(menuBar);
		
		JMenu mnTeste = new JMenu("teste");
		menuBar.add(mnTeste);
		
		JMenuItem mntmTeste = new JMenuItem("teste2");
		mnTeste.add(mntmTeste);
		
		menuBar.setLayout(new GridBagLayout());
		setJMenuBar(menuBar);
		setVisible(true);
	}
}
