package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame{
	private JButton open, save, saveAs, clear, exit;
	private JTextArea editarea;
	
	public MyEditor() {
		super("My Editor");
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		saveAs = new JButton("Save As");
		clear = new JButton("Clear");
		exit = new JButton("Exit");
		editarea = new JTextArea();
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open); top.add(save);top.add(saveAs);
		top.add(clear);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		add(editarea, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
