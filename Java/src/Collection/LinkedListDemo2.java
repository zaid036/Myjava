package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {
	
	
	public static void main(String[] args) {
	
		/*
		 * List<String> list=new ArrayList<>(15); System.out.println(list.size());
		 * list.add("Zaid"); list.add("Naseem Bhai"); list.add("Aziz Bhai");
		 * list.add("Ajaz Bhai");
		 * 
		 * List<String> list1=new ArrayList<>(15); //System.out.println(list.size());
		 * list1.add("Zaid"); list1.add("Naseem Bhai"); list1.add("Aziz Bhai");
		 * list1.add("Ajaz Bhai");
		 * 
		 * System.out.println(list.size()); System.out.println(list);
		 * 
		 * System.out.println();
		 * 
		 * System.out.println(list.get(0)==list1.get(0));
		 * 
		 * System.out.println(list.get(0).equals(list1.get(1)));
		 */
	
		LinkedList <String> l=new LinkedList<>();
		l.add("Zaid");
		l.add("Tanzeel");
		l.add("Aqib");
		l.add("Aqib");
		l.add("Aziz");
		l.add("Tanzeel");
		
	
		System.out.println(l.lastIndexOf("Aqib"));
		System.out.println(l.indexOf("Tanzeel"));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println();
		
	
		System.out.println();
		
		
	}

}
