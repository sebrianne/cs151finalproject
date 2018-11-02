import javax.swing.*;
import java.awt.*;

/**
 * Missile.java
 *
 * @author Lovejit Kharod
 * Last edited: October 31st, 2018
 * Purpose: class that enables the drone to shoot at airplanes.
 */

public class Missile extends JLabel {
	private final int MISSILE_SPEED = 3;
	private int w, h, x, y;
	private Image image;

	Missile(int x, int y) {
		ImageIcon ii = new ImageIcon("src/resources/Missile.png");
		image = ii.getImage();
		w = image.getWidth(null);
		h = image.getHeight(null);
		this.x = x;
		this.y = y;
	}

	public void move() {
		this.x += MISSILE_SPEED;
	}
}