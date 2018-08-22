package Applet;
import java.applet.Applet;
import java.awt.*;

public class Chess_Board extends Applet{
//Don't declare temporary variables here, they are the class property. 

//init method
public void init()
{

	 
	setBackground(new Color(50,160,160));
	setForeground(new Color(1,0,0));  //Default is also black
	
}

//paint method
public void paint(Graphics g)

{

int row=0,col =0;
int row_pos=80;  //Starting point of drawing
int col_pos=80;
boolean white = true;

	for( row=0;row<8;row++)
	    {
		   for (col=0;col<8;col++) 
		   {
	
			   if(white)
				   g.setColor(Color.black);
			   else
				   g.setColor(Color.white);
								
			//Always do following in the current row while changing columns
			   	   g.fillRect(col_pos,row_pos,80,80);
	        	   col_pos+=80;
			       white = !white;  //Always invert previous color
			
     	} //inner for loop
		col_pos=80; //Come back to Original Y and advanced X
		row_pos +=80;
		white = !white;  //Here also you should invert
		
}//outer for loop

}//paint
}  //Applet






