import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Lightning extends JPanel {
    private int sizeOfFrame;

    private BufferedImage image;

    private int x, y;

    public Lightning(int sizeOfFrame) {
        this.sizeOfFrame = sizeOfFrame;
        try {
            image = ImageIO.read(new File("Lightning.jpg"));
        } catch (IOException ex) {
            System.out.println("YOU NEED A LIGHTNING, DUDE!");
        }

        Random randomGenerator = new Random();
        this.x = randomGenerator.nextInt(sizeOfFrame - 10);
        randomGenerator = new Random();
        this.y = randomGenerator.nextInt(sizeOfFrame - 10);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, x, y, 10, 10, null);
    }
}
