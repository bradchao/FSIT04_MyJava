package tw.org.iii.myjava;

import javax.swing.JFrame;

public class Brad24 extends JFrame{
	public Brad24() {
		super("My Window");
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad24();
	}

}
