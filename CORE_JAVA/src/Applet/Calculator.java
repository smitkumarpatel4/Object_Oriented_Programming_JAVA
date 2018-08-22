package Applet;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Calculator {

	private JFrame frame;
	private JTextField Z;
	private JTextField TF1;
	private JTextField TF2;
	private JTextField TF3;
	private JButton btnNewAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		int x=0,y=0,z=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddition = new JButton("Addition");
		btnAddition.setBounds(97, 114, 200, 50);
		frame.getContentPane().add(btnAddition);
		
		TF1 = new JTextField();
		TF1.setBounds(30, 33, 129, 20);
		frame.getContentPane().add(TF1);
		TF1.setColumns(10);
		x=setText(TF1);
		
		TF2 = new JTextField();
		TF2.setBounds(240, 33, 129, 20);
		frame.getContentPane().add(TF2);
		TF2.setColumns(10);
		y=setText(TF2);
		
		
		TF3 = new JTextField();
		TF3.setBounds(134, 83, 129, 20);
		frame.getContentPane().add(TF3);
		TF3.setColumns(10);
		
		btnNewAdd = new JButton("new Add");
		btnNewAdd.setBounds(97, 183, 200, 50);
		frame.getContentPane().add(btnNewAdd);
		z=x+y;
		TF3=getText(z);
		
	}

	private JTextField getText(int z2) {
		// TODO Auto-generated method stub
		return null;
	}

	private int setText(JTextField tF12) {
		// TODO Auto-generated method stub
		return 0;
	}

}
