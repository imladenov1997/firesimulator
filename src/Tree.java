import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Created by Ivo Mladenov
 */
public class Tree extends JPanel {
    private int radius;
    private int length;
    private int width;

    public Tree(int w, int h) {
        super();
        this.radius = 20;
        this.length = 80;
        this.width = 6;
        
        Random random = new Random();
        this.setBounds(random.nextInt(w-100), random.nextInt(h-200), 100, 200);
        
//        addMouseListener(new MouseAdapter() {
//			@Override public void mouseClicked(MouseEvent e) {
//				int w = e.getX() - getX();
//				int h = e.getY() - getY();
//				if (w > 0 && w < getWidth() && h > 0 && h < getHeight()) {
//					setVisible(false);
//				}
//			}
//		});
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(153, 76, 0));
        g2d.fillRect(50 - width, 100 - length, 2*width, length);
        g2d.setColor(Color.GREEN);
        g2d.fillOval(50 - radius, 100 - length - radius, 2*radius, 2*radius);
    }
}
