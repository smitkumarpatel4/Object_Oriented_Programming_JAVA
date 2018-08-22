package A_LAB_10_B;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Applet2 extends Applet implements MouseListener,MouseMotionListener{
    int x,y;
	public void init(){
		addMouseListener(this);
	addMouseMotionListener(this);
		setBackground(Color.yellow);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.red);
		//g.fillOval(x, y, 50 , 50);
		g.drawString(" "+x+", "+y,x,y);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
		//Graphics g=getGraphics();
		//paint(g);
		repaint();	
	}
}
