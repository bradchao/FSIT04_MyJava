import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySing extends JFrame {
	private JButton clear;
	private MyDrawer drawer;
	
	public MySing() {
		super("簽名");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);
		add(top, BorderLayout.NORTH);
		
		drawer = new MyDrawer();
		add(drawer, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				drawer.clear();
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new MySing();
	}

}
