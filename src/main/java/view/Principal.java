package view;


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
		setSize(300, 300);
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 300, 21);
		desktopPane.add(menuBar);
		
		JMenu mnTeste = new JMenu("teste");
		menuBar.add(mnTeste);
		
		JMenuItem mntmTeste = new JMenuItem("teste2");
		mnTeste.add(mntmTeste);
		setVisible(true);
	}
}
