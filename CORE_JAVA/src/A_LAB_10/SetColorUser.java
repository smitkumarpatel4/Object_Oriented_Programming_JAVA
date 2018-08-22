package A_LAB_10;

import java.util.Scanner;
import java.applet.Applet;
import java.awt.*;
public class SetColorUser extends Applet
{
	TextField text1;
	TextField text2;
	TextField text3;
	TextField text4;
	Button b1;
	
	Scanner Input=new Scanner(System.in);

	public void init()
	{
		
		setSize(512,512);
		b1=new Button("Go");
		text1=new TextField(10);
		text2=new TextField(7);
		text3=new TextField(7);
		text4=new TextField(7);
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(b1);
		
		text1.setText("Shape:");
		text2.setText("% of Red");
		text3.setText("% of Green");
		text4.setText("% of Blue");
		
		
	}
	
	public void paint(Graphics g)
	{
		int r,gr,b;
		String S1,S2,S3,S4;
		g.drawString("Enter The Shape", 10, 20);
		
		g.drawString("Please enter the % of colors in the range of 0 to 255.", 10, 40);
		try
		{
			S1=text1.getText();
			S1=S1.trim();
			
			S2=text2.getText();
			r=Integer.parseInt(S2);
			S3=text3.getText();
			gr=Integer.parseInt(S3);
			S4=text2.getText();
			b=Integer.parseInt(S4);
			
			switch(S1)
			{
			case "Square":
			case "square":
				g.drawString("You had chosen:" +S1,10,60);
				
				g.setColor(new Color(r,gr,b));
				g.fillRect(80, 80, 360, 360);
				break;
			
			case "Rect":
			case "rect":
				g.drawString("You had chosen:" +S1,10,60);
				
				g.setColor(new Color(r,gr,b));
				g.fillRect(80,80,400,300);
				break;
				
			case "Oval":
			case "oval":
				g.drawString("You had chosen:" +S1,10,60);
				
				g.setColor(new Color(r,gr,b));
				g.fillOval(80, 80, 400, 400);
				break;
				
			}	
		}
		
		catch(Exception e)
		{
			
		}
	}
	
	public boolean action(Event e, Object o)
	{
		repaint();
		return true;
		
	}
	
}
