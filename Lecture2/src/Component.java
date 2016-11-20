import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Component extends JComponent {
	
	static int counter = 0;
	
	public void paintComponent (Graphics g)
	{	Rectangle firstRectangle = new Rectangle(10,10,1280,720);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(firstRectangle);
		
		System.out.println(counter++);
	}
}
