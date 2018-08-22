package Applet;
	import java.applet.Applet;
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	public class Fall_Animation  extends Applet 
	implements Runnable
	{ 
	     
	    int updateInterval = 17;   //17 millisecond between frames, it erases whole frame and
	    							//redraw it again
	    private int x,y;
	    
	     
	    public void init()
	    {
	    	x=0;
	    	y=0;
	    	setSize(1000,800);
	    	setBackground(Color.yellow);
	    }
	 
	    public void start()
	    {
	    Thread thread =  new Thread(this);
	    thread.start();
	    }
	    
	    public void run() { 
	        while ( true )
	        { 
	          
	        	try {   
	                Thread.sleep( updateInterval );  
	            }  
	            catch (InterruptedException e ) { } 
	 
	            repaint(); 
	        } 
	    } 
	 
	    public void paint(Graphics g)
	    
	    {
	    g.setColor(Color.red);	
	    g.fillOval(x, y, 30, 30);
	    
	    x=x+5;
	    y=y+5;	
	    }
   
	    }  
