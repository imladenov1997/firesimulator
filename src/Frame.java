import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame implements Runnable {
	private static final long serialVersionUID = 830853933050926809L;

	public static void main(String[] args) {
		new Frame();
	}
	public Frame() {
		super("Fire Simulator");
		SwingUtilities.invokeLater(this);
	}

	// Setup
	@Override public void run() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(800, 600));
		
		////
		
		setVisible(true);
	}

	@Override public void paint (Graphics g) {
		super.paint(g);
		
	}
}
