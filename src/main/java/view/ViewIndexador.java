package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.beans.PropertyVetoException;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

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
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		setBounds(0, 0, 850, 400);
		

	}
}
