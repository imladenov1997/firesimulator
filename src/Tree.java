import javax.swing.*;
import java.awt.*;

/**
 * Created by Ivo Mladenov
 */
public class Tree extends JPanel {
    private int radius;
    private int length;
    private int width;

    public Tree(int x, int y) {
        super();
        this.radius = 50;
        this.length = 180;
        this.width = 15;
        this.setBounds(x, y, 300, 300);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(153, 76, 0));
        g2d.fillRect(150 - width, 300 - length, 2*width, length);
        g2d.setColor(Color.GREEN);
        g2d.fillOval(150 - radius, 300 - length - radius, 2*radius, 2*radius);
    }
}
