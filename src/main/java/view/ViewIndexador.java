package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.beans.PropertyVetoException;
import java.awt.Color;

@SuppressWarnings("serial")
public class ViewIndexador extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewIndexador frame = new ViewIndexador();
					frame.setSize(500, 500);
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
	 */
	public ViewIndexador() throws PropertyVetoException {
		setTitle("Indexador");
		setMaximizable(true);
		setClosable(true);
		getContentPane().setForeground(Color.WHITE);
		setBounds(0, 0, 450, 300);
		getContentPane().setLayout(null);
		

	}

}
