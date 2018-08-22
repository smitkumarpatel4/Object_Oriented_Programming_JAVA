package A_LAB_10;

import java.applet.Applet;
import java.awt.*;    //abstract window tool kit & call for graphics
public class A_Texts extends Applet  {
	
	TextField text1;
	TextField text2;
	
	public void init()
	{
		text1=new TextField();
		text2=new TextField();
		
		add(text1);
		add(text2);
		
		text1.setText("number1");
		text2.setText("number2");
				
	}
	
	public void paint(Graphics g)
	{
		String s1,s2;
		float a=0,b=0;
		
		g.drawString("enter data in boxes", 10, 20);
	
	
	try
	{
		s1=text1.getText();
		s2=text2.getText();
		
		a=Float.parseFloat(s1);
		b=Float.parseFloat(s2);
		                           
	}
	
	catch(Exception e)
	{
		
	}
	float c=a+b;
	String ans1=String.valueOf(c);
	
	g.drawString("the ans= ",20,40);
	g.drawString(ans1,30,60);
	}
	
	public boolean action(Event e, Object O)
	
	{
		repaint();
		return true;
	
	
	}
	

}
