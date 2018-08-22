package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
public class TrimApplet extends Applet
{
	TextField text1;
	
	public void init()
	{
		text1=new TextField(30);
		add(text1);
		
		text1.setText("Email ID:");
	}
	
	public void paint(Graphics g)
	{
		String S1,S2;
		g.drawString("Enter Your Mail ID:",10,20);
		
		S1=text1.getText();
		S2=S1.trim();
		
		g.drawString(":" +S1,10,30);
		g.drawString(S2,10,40);
		g.drawString(":"+S1.length(),10,60);
		g.drawString(":"+S2.length(),10,50);
	}
	
	public boolean action(Event e, Object o)
	{
		repaint();
		return true;
		
	}

}