import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Axe {
	
	private Image image;
	private int x, y;
	
	public Axe(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			image = ImageIO.read(new File("Axe.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void set (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void paint (Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
