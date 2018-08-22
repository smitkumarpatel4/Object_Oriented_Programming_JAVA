package Applet_Games;
import java.applet.Applet;
import java.awt.color.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class BouncingBall extends Applet implements Runnable,KeyListener
{
	int updateinterval =20;
	private int x,y;				//Ball
	private int a;				//Dash
	private int dx=1;
	private int dy=1;
	Thread thread;

	public void init()
	{
		addKeyListener(this);
		x=0;
		y=0;
		setSize(1000,700);
		setBackground(Color.YELLOW);
	}
	
	public void start()
	{
		thread =new Thread();
		thread.start();
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				Thread.sleep(updateinterval);
			}
			
			catch(Exception e)
			{	
			}
			
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(x,y,30,30);
		//x=x+dx;
		y=y+dy;
		repaint();
		
		//g.setColor(Color.BLACK);
		//g.fillRect(00, 00, 20, 80);
		//repaint();
		
		 if(x>this.getWidth()-30)
		{
			dx=-dx;
			x=this.getWidth()-30;
			//x=x+dx;
			//repaint();
		}
		
		else if(x<0)
		{
			dx=-dx;
			x=0;
		//	repaint();
		}
		else
		{
			x=x+dx;	
		}
		if(y>getHeight()-25)
		{
			dy=-dy;
			y=y+dy;
			repaint();
		}
		
		else if(y<0)
		{
			dy=-dy;
			y=y+dy;
			repaint();
		}
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent k)
	{
		// TODO Auto-generated method stub
		
		a=k.getID();
		
		switch(k.getKeyCode())
		{
		case KeyEvent.VK_UP:  a=a-5;
		Graphics g=getGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(a, 00, 20, 80);
		repaint();
		
		break;
		
		case KeyEvent.VK_DOWN: a=a+5;
		Graphics h=getGraphics();
		h.setColor(Color.BLACK);
		h.fillRect(a, 00, 20, 80);
		repaint();
		
		break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
