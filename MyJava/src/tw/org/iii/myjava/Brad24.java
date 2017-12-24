package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad24 extends JFrame implements ActionListener{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	
	public Brad24() {
		super("My Window");
	
		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);
		
		guess.addActionListener(this);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad24();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("got it");
	}

}
