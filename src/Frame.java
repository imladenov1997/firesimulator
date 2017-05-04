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
	private Axe axe;
	private Lightning lightning;
	
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
		
		if (axe != null) {
			axe.paint(g);
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		mouseMoved(arg0);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		if (axe != null) {
			axe.set(arg0.getX(), arg0.getY());
			repaint(50);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (tree == null) {
			tree = new Tree[10]; // Some w/h relation
			Arrays.setAll(tree, i -> {
				Tree t = new Tree(getWidth(), getHeight());
				add (t);
				return t;
			});
			axe = new Axe(getWidth()/2, getHeight()/2);
			
			lightning = new Lightning(getHeight());
			add (lightning);
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
