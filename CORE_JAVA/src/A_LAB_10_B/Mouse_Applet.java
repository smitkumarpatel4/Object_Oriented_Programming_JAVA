package A_LAB_10_B;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Applet extends Applet implements MouseListener{

	public void init(){
		addMouseListener(this);
		
	}
	
	public void paint(Graphics g){
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.blue);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.red);
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.yellow);
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.green);
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		setBackground(Color.gray);
		repaint();
		
	}
}
