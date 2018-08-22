package A_LAB_4;

import java.util.Vector;
public class Vector3 {

	public static void main(String[] args){
		Vector<String> list=new Vector<String>(2);
		list.addElement("EC");
		list.addElement("IT");
		System.out.println("Brenches = "+list);
		list.insertElementAt("CE",1);
		list.insertElementAt("IC",2);
		System.out.println("New Branches  = "+list);	
			
	}
	
}