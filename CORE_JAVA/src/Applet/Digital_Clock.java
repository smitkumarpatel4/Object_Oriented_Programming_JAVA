package Applet;
	 import java.awt.Color;
	 import java.awt.Graphics;
	 import java.awt.Font;
	 import java.util.Date;

	 public class Digital_Clock extends java.applet.Applet 
	 implements Runnable 
	 {   
	   	 Font myFont ;
	 	 Date theDate;
	 	 Thread runner;
	   
	 public void init()
	   {
	 	myFont = new Font("TimesRoman",Font.BOLD,58); 
	 	setSize(900,300);  //rectangualr clock
	 	setBackground(Color.GREEN);
	   }	 	 
	    public void start() {
	      if (runner == null) {
	        runner = new Thread(this);
	        runner.start();
	     }
	    }	    
	    public void run() {
	      while (true) {
	        theDate = new Date();
	        repaint();
	       
	        try
	        {
	          Thread.sleep(1000);   ///flicker at 100
	        }
	        catch (InterruptedException e) { }
	     }
	   }
	  
	    public void paint(Graphics g) 
	    {
	      g.setFont(myFont);
	      g.setColor(new Color(120,0,0));    //(120 Red, 0 Green,  0 Blue ) = Cofee , Max 255
	      g.drawString(theDate.toString(),100,150);   //Same location, always
	    }
	 }

