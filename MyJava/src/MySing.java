import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySing extends JFrame {
	private MyDrawer drawer;
	
	public MySing() {
		super("簽名");
		setLayout(new BorderLayout());
		
		drawer = new MyDrawer();
		add(drawer, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MySing();
	}

}
