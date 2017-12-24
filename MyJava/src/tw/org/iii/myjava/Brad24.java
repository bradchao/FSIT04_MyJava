package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad24 extends JFrame implements ActionListener{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	private String answer;
	
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
		guess.addActionListener(new MyActionListener());
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				doGuess();
			}
		});
		
		log.addMouseMotionListener(new MyMouseListener());
		log.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// 1. Create a Answer
		answer = createAnswer(3); 
		System.out.println(answer);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("OK2");
		}
	}
	
	
	public static void main(String[] args) {
		new Brad24();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String inputGuess = input.getText();
		String result = checkAB(answer, inputGuess);
		JOptionPane.showMessageDialog(null, result);
		log.append(inputGuess + " : " + result + "\n");
		if (result.equals("3A0B")) {
		}
		
		input.setText("");
		
		
	}

	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent event) {
			System.out.println("OK");
		}
	}
	
	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		
		for (int i=0 ;i<a.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if (a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		
		return A + "A" + B +"B";
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=poker.length; i>0; i--) {	
			int rand = (int)(Math.random()*i);	
			int temp = poker[rand];
			poker[rand] = poker[i-1];
			poker[i-1] = temp;
		}
		
		String ret = "";
		for (int i=0; i<d; i++) {
			ret += poker[i];
		}
		
		return ret;
	}
	
	private void doGuess() {
		
	}
}
