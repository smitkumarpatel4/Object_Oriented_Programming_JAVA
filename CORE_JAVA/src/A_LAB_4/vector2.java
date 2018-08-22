package A_LAB_4;

import java.util.*;
public class vector2 {

	public static void main(String[] args){
		Vector<String> list=new Vector<String>(4);
		list.addElement("Smit");
		list.addElement("Swapnil");
		list.addElement("Shreyas");
		list.addElement("Shan");
		System.out.println(list);	
		list.removeElementAt(1);
		System.out.println(list);
	}
	
}