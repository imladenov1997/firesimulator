import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame implements Runnable, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 830853933050926809L;

	public static void main(String[] args) {
		new Frame();
	}
	
	private Tree[] tree;
//	private Axe axe;
	
	public Frame() {
		super("Fire Simulator");
		setLayout(new FlowLayout());
		addMouseListener(this);
		addMouseMotionListener(this);
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

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (tree == null) {
			tree = new Tree[10]; // Some w/h relation
			Arrays.setAll(tree, i -> new Tree(10,10)); // size-dependent? For painting?
			add (tree[0]);
		}
//		else if (axe != null) {
//			
//		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
