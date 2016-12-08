package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class SelectPasta implements ActionListener{
	private JTextField text;
	public SelectPasta(JTextField text) {
		super();
		this.text = text;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser chooserDiretorio = new JFileChooser();
		chooserDiretorio.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooserDiretorio.showOpenDialog(null);
		text.setText(chooserDiretorio.getSelectedFile().getAbsolutePath());
	}
	
}
