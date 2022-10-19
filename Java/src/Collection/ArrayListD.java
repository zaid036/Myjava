package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListD {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();//Generic
		list.add(new Integer(200));
		list.add(400);
		list.add(600);
		list.add(800);
		list.add(1000);
		//list.add("Hello");
		ArrayList l=new ArrayList<>(); //non generic
		l.add("Hello");
		l.add("Java");
		l.add(1000);
		
		System.out.println(list);
		System.out.println(l);
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Zaid");
		
		ArrayList<String> al1=new ArrayList<>();
		al1.add("Zaid");
		
		System.out.println(al==al1);
		
		System.out.println(al.hashCode());
		System.out.println(al1.hashCode());
		System.out.println(al.equals(al1));
		
		ArrayList<Character> al2=new ArrayList<>();
		al2.add('c');
		al2.add('a');
		al2.add('d');
		al2.add('b');
		al2.add('a');
		al2.add('c');
		System.out.println(al2);
		
		for (int i = 0; i < al2.size(); i++) {
			
			Character ch=al2.get(i);
			if(al2.contains(ch)) {
				
				System.out.println(ch +" Present in "+i+ " index");
			}
		}
		
		System.out.println(al2);
	  List<Character> list2 = al2.subList(0, 4);
	  
	  System.out.println(list2);
	  
	  
	 Collections.sort(al2);
	 System.out.println(al2);
	}

}
