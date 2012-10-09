import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Animal {
	private static final int CHEEZ_LENGTH = 30;
	private static final int CHEEZ_HEIGHT = 20;
	public void draw(Graphics g, int cheezX, int cheezY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.yellow);
		g2.fillRect(cheezX, cheezY, CHEEZ_LENGTH, CHEEZ_HEIGHT);
		g2.setColor(Color.gray);
		g2.drawString("(Gouda)", cheezX, cheezY+CHEEZ_HEIGHT+10);	
	}
}