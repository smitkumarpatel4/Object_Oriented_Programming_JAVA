package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
public class Rect extends Applet
{
	public void paint(Graphics g)
	{	
		//g.setColor(Color.RED);
		//g.fillRect(25, 25, 150, 250);
		
		g.setColor(Color.RED);
		g.fill3DRect(25, 10, 50, 75, true);
		
		//g.setColor(Color.GREEN);
		//g.fillRect(50, 50, 100, 200);
	}
	
	
}
