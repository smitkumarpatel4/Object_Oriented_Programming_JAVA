package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
public class AddApplet extends Applet
{
	TextField text1;
	TextField text2;
	TextField text3;
	
	public void init()
	{
		text1=new TextField(8);
		text2=new TextField(8);
		text3=new TextField(10);
		
		add(text1);
		add(text2);
		add(text3);
		
		text1.setText("Number 1");
		text2.setText("Number 2");
		text3.setText("Answer");
	}
	
	public void paint(Graphics g)
	{
		String S1,S2;
		float a=0,b=0;
		g.drawString("Enter the Float Value", 10, 10);
		
		try
		{
			S1=text1.getText();
			S2=text2.getText();
			a=Float.parseFloat(S1);
			b=Float.parseFloat(S2);
		}
		
		catch(Exception e)
		{
			g.drawString("Error in Number", 10, 50);
		}
		
		float c=a+b;
		
		String ans=String.valueOf(c);
		text3.setText(ans);
		//g.drawString("Answer is ",30,60);
		//g.drawString(Ans,90,60);
	}
	
	public boolean action(Event e, Object o)
	{
		repaint();
		return true;
		
	}
}
