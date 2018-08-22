package Applet_Games;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Animation extends Applet implements Runnable,MouseListener
{
    
Thread t1;
int x=100,y=100,p=100,k=100;
    
public void init()
{
    addMouseListener(this);
    setBackground(Color.cyan);
    setSize(1400,1000);
}
public void paint(Graphics g)
{
    g.drawString("---------------------------------------------------------------------------------------------------------------------------------------------------------------------", 100, 105);
    g.drawString("---------------------------------------------------------------------------------------------------------------------------------------------------------------------", 100, 385);
       if(x<200){
 g.setColor(Color.red);
 x=x+2;
 y=y+5;
 g.fillOval(x,y, 30 ,30);
    }else if(x>=200&&x<300)
    {
 g.setColor(Color.yellow);
 x=x+2;
 y=y-5;
 g.fillOval(x,y, 30 ,30);
    }  
    else if(x>=300&&x<400){
 g.setColor(Color.MAGENTA);
 x=x+2;
 y=y+5;
 g.fillOval(x,y, 30 ,30);        
    }
       else if(x>=400&&x<500){
 g.setColor(Color.black);
 x=x+2;
 y=y-5;
 g.fillOval(x,y, 30 ,30);
    }
       else if(x<600)
       {
    g.setColor(Color.GREEN);
 x=x+2;
 y=y+5;
 g.fillOval(x,y, 30 ,30);
    }
       else
       {
    	   x=100;
    	   y=100;
       }
       
}

    
public void start()
{
 t1= new Thread(this);
 t1.start();
 }
    @Override
    public void run() {
        while(true)
        {
        
        try{
        t1.sleep(10);
    }
    
    catch(Exception e)
    {
        
    }
        Graphics g=getGraphics();
        paint(g);
   }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //setBackground(Color.white);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    //setBackground(Color.orange);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //setBackground(Color.CYAN);
    }
}