package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
public class EmailApplet  extends Applet
{
	TextField text1;
	Button B1;
	
	public void init()
	{
		setSize(512, 512);
		setBackground(Color.CYAN);
		B1=new Button("Go");
		text1=new TextField(30);
		add(text1);
		add(B1);
		
		text1.setText("Email ID:");
	}
	
	public void paint(Graphics g)
	{
		boolean k = false;
		String S1 = null;
		g.drawString("Enter Your Mail ID:",10,20);
		
		try
		{
			S1=text1.getText();
			S1=S1.trim();
			S1=S1.toLowerCase();
			
			g.drawString(":"+S1, 80, 50);
			String S2;
			S2=S1.substring(S1.length()-10);
			g.drawString(S2, 10, 40);
			
			boolean z=S2.equalsIgnoreCase("@gmail.com");
			if(z==true)
			{
			
			int i;
			{
			for(i=0;i<S1.length();i++)
			{
				if(S1.charAt(i)==' ')
				{
					k=true;
					g.drawString("Wrong Input...You Enterd Sapce at position:" +i,10,80);
					break;
				}
			}
			{
				for(i=0;i<S1.length();i++)
					if(k==false)
				   {	
						if(((S1.charAt(i)=='_')||(S1.charAt(i)=='.')||(48<=S1.charAt(i)||S1.charAt(i)>=57)))
						{
							char a=S1.charAt(0);
							int b=(int)a;
							if((97<=b||b>=122))
							{
							g.drawString("Thanks For Your ID.",10,80);
							}
							else
							{
								g.drawString("You had entered any Special Character at 1St place.", 10, 100);
							}
						}
						else
						{
						g.drawString("You enterd either Number or any Special Character at:" +i +"position.",10,100);
						}
					
				   }
		   	    }
			
		      }
			}
			else
			{
				g.drawString("Wrong Input...Please enter your Gmail ID.",10,80);
			}
		}
		
		catch(Exception e)
		{
			g.drawString("Wrong Email ID you have entered.", 10, 100);
		}
		
		

	}
	
	
	public boolean action(Event e, Object o)
	{
		repaint();
		return true;
		
	}

	private int b(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int S1(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
