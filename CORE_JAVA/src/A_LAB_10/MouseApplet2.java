package A_LAB_10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MouseApplet2 extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
		
		public void init()
		{
			addMouseListener(this);
			addMouseMotionListener(this);
			
			
		}
		
		public void paint(Graphics g)
		{
			setBackground(Color.YELLOW);
			
			g.setColor(Color.RED);
			g.fillRect(1150, 00, 165, 165);
			
			
			g.setColor(Color.BLUE);
			g.fillRect(1150, 165, 165, 165);
			
			g.setColor(Color.GREEN);
			g.fillRect(1150, 330, 165, 165);
			
			g.setColor(Color.GRAY);
			g.fillRect(1150, 495, 165, 165);
			{
			g.setColor(Color.RED);
			g.drawString("X:" +x +" Y:" +y, x,y);
			}
		}

		@Override
		public void mouseClicked(MouseEvent me) 
		{
			// TODO Auto-generated method stub
			//setBackground(Color.RED);
			x=me.getX();
			y=me.getY();
			Graphics g=getGraphics();
			paint(g);
		}

		@Override
		public void mouseEntered(MouseEvent me) 
		{
			// TODO Auto-generated method stub
			//setBackground(Color.BLUE);
		}

		@Override
		public void mouseExited(MouseEvent me) 
		{
			// TODO Auto-generated method stub
			//setBackground(Color.WHITE);
		}

		@Override
		public void mousePressed(MouseEvent me)
		{
			// TODO Auto-generated method stub
			//setBackground(Color.YELLOW);
		}

		@Override
		public void mouseReleased(MouseEvent me) 
		{
			// TODO Auto-generated method stub
			//setBackground(Color.GRAY);
		}

		@Override
		public void mouseDragged(MouseEvent me)
		{
			// TODO Auto-generated method stub
			x=me.getX();
			y=me.getY();
			Graphics g=getGraphics();
			paint(g);
			//repaint();
		}

		@Override
		public void mouseMoved(MouseEvent me)
		{
			// TODO Auto-generated method stub
			
		}
		
		

}


