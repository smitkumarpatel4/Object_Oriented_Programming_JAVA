package Applet_Games;
import java.applet.Applet;
	import java.awt.*;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	
	public class Game1 extends Applet implements Runnable,MouseListener{
	int x=400,y,a=800,c=500,l,q;
	Font myfont;
	Thread t1;

	    public void start()
	    {
	      t1=new Thread(this);
	      t1.start();
	    
	    }
	    public void init()
	    {
	        
	        addMouseListener(this);
	        setSize(1200,500);
	    }
	    public void paint(Graphics g)
	    {
	        if(x==q)
	        {
	        
	            g.drawString("GAME OVER",600,250);
	        t1.stop();
	        }
	        l=l-5;
	        g.drawRect(q,(l), 10, 5);
	     //g.drawString(" "+(x-400), x,60);
	       if(x<=800)
	       {
	           
	        g.setColor(Color.green);
	        x=x+2;
	        g.fillRect( x, 30, 50,50);
	       }
	       else if(a>400)
	       {
	    x=x-400;     
	             }
	    
	    }
	    @Override
	    public void run() {
	    while(true)
	    {
	        try
	        {
	            t1.sleep(10);
	            
	        }
	    catch(Exception e)
	    {
	        
	    }
	        repaint();
	    }
	    }

	   
	    @Override
	    public void mouseClicked(MouseEvent e) {
	  l=e.getY();
	  q=e.getX();
	Graphics g= getGraphics();
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	    }

	}


