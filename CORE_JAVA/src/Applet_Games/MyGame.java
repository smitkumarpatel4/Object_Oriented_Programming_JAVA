package Applet_Games;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MyGame extends Applet
    implements Runnable,MouseListener,MouseMotionListener
    {
        int updateInterval = 15;
 int q,l,s,d;
        private double gravity=15;
        private double enrgyoss=0.9;
        double dt = 0.2;
        
        private double x,y;
        private double dx=5,dy=2;
        Thread thread;
        public void init()
        {
            x=0;y=0;
            addMouseListener(this);
            addMouseMotionListener(this);
            setSize(1000,500);
            setBackground(Color.white);
        }
        public void start()
        {
            thread = new Thread(this);
            thread.start();
        }
        public void run()
        {
            
            while(true)
            {
            
                
                    
                try{
                    Thread.sleep(updateInterval);
                    }
                catch(Exception e){}
              //Graphics g=getGraphics();
                repaint();
            }
        }
        public void paint(Graphics g)
        {
           y=y+dy;
                x=x+dx;
    
                l=l-25;
    
           g.setColor(Color.red);
                g.fillRect(q, l, 10, 10);
         g.setColor(Color.red);
         s=s-25;
                g.fillRect(s, d, 10, 10);
   
                
                //g.drawString("HIT ME IF U CAN",(int) x, (int)y);
                if( (((q<=x+25)&&(q>x-25))&&((l<=y+25)&&(l>y-25)))||(((s<=x+25)&&(s>x-25))&&((d<=y+25)&&(d>y-25))) )
         {
             g.drawString("TARGET HIT CONGRATS", 500, 200);
             thread.stop();
         }
                if(x>this.getWidth()-30)
                {
                    
                    x=this.getWidth()-30;
                    dx=-dx;
                  g.setColor(Color.cyan);
            g.fillOval((int)x, (int)y, 50,50);   
                }
                else if(x<0)
                {
                    
                    dx=-dx;
                  g.setColor(Color.cyan);
            g.fillOval((int)x, (int)y, 50,50);   
                }
                else
                {
                    //x=x+dx;
                }
                
                
                
                if(y>this.getHeight()-30)
                {
                    y=this.getHeight()-30;
                    dy = dy;   //reduce p each time ball hits down
                    dy=-dy;
                 g.setColor(Color.cyan);
            g.fillOval((int)x, (int)y, 50,50);
                }
            
                else
                {
                //Velocity formula 
                    dy += gravity*dt;
           y+= dy*dt +0.9*gravity*dt*dt;
            g.setColor(Color.cyan);
            g.fillOval((int)x, (int)y, 50,50);
                }
            
        }

    @Override
    public void mouseClicked(MouseEvent e) {
    q=e.getX();
    l=e.getY();
   
    repaint();
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

    @Override
    public void mouseDragged(MouseEvent e) {
    s=e.getX();
    d=e.getY();
   //Graphics g=getGraphics();
    repaint();
    
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    
    }
}
    