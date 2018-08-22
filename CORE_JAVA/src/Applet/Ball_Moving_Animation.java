package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ball_Moving_Animation extends Applet
    implements Runnable
    {
        int updateInterval = 17;
 
        private double gravity=15;
        private double enrgyoss=0.9;
        double dt = 0.2;
        
        private double x,y;
        private double dx=5,dy=7;
        
        public void init()
        {
            x=0;y=0;
            setSize(1000,800);
            setBackground(Color.gray);
        }
        public void start()
        {
            Thread thread = new Thread(this);
            thread.start();
        }
        public void run()
        {
            
            while(true)
            {
            
                y=y+dy;
                x=x+dx;
                
                if(x>this.getWidth()-30)
                {
                    
                    x=this.getWidth()-30;
                    dx=-dx;
                    
                }
                else if(x<0)
                {
                    
                    dx=-dx;
                    
                }
                else
                {
                   //s x=x+dx;
                }
                
                
                
                if(y>this.getHeight()-30)
                {
                    y=this.getHeight()-30;
                    dy = dy;   //reduce p each time ball hits down
                    dy=-dy;
                }
            
                else
                {
                //Velocity formula 
                    dy += gravity*dt;
                    
                    y+= dy*dt +0.9*gravity*dt*dt;
                }
                    
                try{
                    Thread.sleep(updateInterval);
                    }
                catch(Exception e){}
                repaint();
            }
        }
        public void paint(Graphics g)
        {
            g.setColor(Color.red);
            g.fillOval((int)x, (int)y, 30,30);
            
        }
        
    }