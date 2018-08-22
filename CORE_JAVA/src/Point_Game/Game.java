package Point_Game;
import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Game extends Applet implements Runnable,MouseListener{

int hits=0;
int misses=0;

int x;
int y;

public void init(){
	addMouseListener(this);
	setBackground(Color.white);
}

public void paint(Graphics g){
	Random v=new Random();
	x=v.nextInt(250);
	y=v.nextInt(250);
	g.setColor(Color.cyan);
	g.fillOval(x,y,20,20);
	this.showStatus("Hits : "+hits+"  Miss : "+misses);
	run();
	repaint();
}

public void run(){
	try
	{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}

public void mouseClicked(MouseEvent me){
	int m=me.getX();
	int n=me.getY();
	if(m>=x && m<=x+20 && n>=y &&n<=y+20){
		hits++;
	}
	else{
		misses++;
      	}
}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}

}


//*<Applet Code="Game.class" width=300 height=300></Applet>*/