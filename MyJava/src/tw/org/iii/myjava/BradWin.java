package tw.org.iii.myjava;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BradWin extends JFrame{
	private JButton open, save, exit;
	
	public BradWin() {
		super("Brad Window");
	
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		add(open); add(save); add(exit);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BradWin();
	}

}
