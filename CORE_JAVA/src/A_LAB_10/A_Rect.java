package A_LAB_10;

import java.applet.Applet;
import java.awt.*;    //abstract window tool kit & call for graphics
public class A_Rect extends Applet {
	public void paint(Graphics g)
	{
		g.drawRect(10,10,1000,1000);
		g.setColor(Color.blue);
		g.fillRect(10,10,1000,1000);
		
		g.drawRect(20,20,980,980);
		g.setColor(Color.gray);
		g.fillRect(20,20,980,980);
		
		g.drawRect(30,30,960,960);
		g.setColor(Color.magenta);
		g.fillRect(30,30,960,960);
		
		g.drawRect(40,40,940,940);
		g.setColor(Color.yellow);
		g.fillRect(40,40,940,940);
		
		
		
	}

}
