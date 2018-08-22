package A_LAB_4;

import java.util.*;
public class Vector4 {

	public static void main(String[] args){
		Vector<String> list=new Vector<String>(4);
		list.addElement("IDT");
		list.addElement("ANT");
		list.addElement("DCOM");
		list.addElement("OFC");
		System.out.println("6th semester Subjects "+list);
		System.out.println("first subject= "+list.firstElement());
		System.out.println("last subject= "+list.lastElement());
	}
}
