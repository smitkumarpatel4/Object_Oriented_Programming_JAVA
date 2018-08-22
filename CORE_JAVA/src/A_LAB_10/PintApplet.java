package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class PintApplet extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
	public void init()
	{
		setSize(1500,800);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
		//setBackground(Color.YELLOW);
	
		g.setColor(Color.RED);
		g.fillRect(1150, 00, 165, 165);
		
		
		
		
		g.setColor(Color.BLUE);
		g.fillRect(1150, 165, 165, 165);
		
		g.setColor(Color.GREEN);
		g.fillRect(1150, 330, 165, 165);
		
		g.setColor(Color.GRAY);
		g.fillRect(1150, 495, 165, 165);
				
		{
			g.setColor(Color.YELLOW);
			g.fillOval(300, 100, 500, 500);
			g.setColor(new Color(x+y));
			g.fillOval(300, 100, 500, 500);
		}
		
		g.setColor(Color.BLACK);
		g.drawString("X:" +x +" Y:" +y, x, y);
		
	}

	@Override
	public void mouseDragged(MouseEvent me)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent me)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent me) 
	{
		// TODO Auto-generated method stub
		x=me.getX();
		y=me.getY();
		repaint();
		//Graphics g=getGraphics();
		//paint(g);
		
		
	}

	@Override
	public void mouseEntered(MouseEvent me) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent me) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent me)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent me) 
	{
		// TODO Auto-generated method stub
		
	}

}
