package A_LAB_4;

import java.util.*;
public class Vector1 {

	public static void main(String[] args){
		Vector<String> list=new Vector<String>(4);
		list.addElement("c");
		list.addElement("java");
		list.addElement("c++");
		list.addElement("Basic");
		System.out.println("initial capacity= "+list.capacity());
		list.addElement("pascal");
		System.out.println("size of vector= "+list.size());
		System.out.println("final capacity= "+list.capacity()); 
		System.out.println("list of languges= "+list);
	}
}
