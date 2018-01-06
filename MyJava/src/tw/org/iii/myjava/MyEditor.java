package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame{
	private JButton open, save, saveAs, clear, exit;
	private JTextArea editarea;
	private File openFile = null;
	
	public MyEditor() {
		super("My Editor");
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		saveAs = new JButton("Save As");
		clear = new JButton("Clear");
		exit = new JButton("Exit");
		editarea = new JTextArea();
		
		editarea.setFont(new Font(null, 0, 24));
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open); top.add(save);top.add(saveAs);
		top.add(clear);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		add(editarea, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				openFile();
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				saveFile();
			}
		});
		
		saveAs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				saveAsFile();
			}
		});
		
	}
	
	private void saveAsFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File saveFile = jfc.getSelectedFile();
			try {
				FileWriter writer = new FileWriter(saveFile);
				writer.write(editarea.getText());
				writer.flush();
				writer.close();
				JOptionPane.showMessageDialog(null, "Save as ... Success");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	private void saveFile() {
		if (openFile != null) {
			try {
				FileOutputStream fout = new FileOutputStream(openFile);
				fout.write(editarea.getText().getBytes());
				fout.flush();
				fout.close();
				JOptionPane.showMessageDialog(null, "Save Success");
			}catch(Exception ee) {
				System.out.println(ee.toString());
			}
		}else {
			saveAsFile();
		}
	}
	
	private void openFile() {
		
		editarea.setText("");
		
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
			try {
				FileReader reader = new FileReader(openFile);
				int c;
				while ( (c = reader.read()) != -1) {
					editarea.append("" +(char)c);
				}
				reader.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
