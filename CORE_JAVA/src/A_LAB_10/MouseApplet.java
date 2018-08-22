package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MouseApplet extends Applet implements MouseListener
{
	
	public void init()
	{
		addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		setBackground(Color.RED);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		setBackground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		setBackground(Color.WHITE);
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		setBackground(Color.YELLOW);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		setBackground(Color.GRAY);
	}

}
