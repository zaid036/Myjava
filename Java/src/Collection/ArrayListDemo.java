package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> flist=new ArrayList<>();
		
		for(int i=20;i<200;i=i+20)
		{
			flist.add(i);
			
		}
		
		System.out.println("First List "+flist);
		flist.add(2, 400);
		System.out.println("List add in 2nd Index 400 "+flist);
		flist.set(4, 500);
		System.out.println("List set 4th '80' index value with 500  "+flist);
		
		List<Integer> slist=new ArrayList<>();
		slist.add(111);
		slist.add(222);
		slist.add(333);
		slist.add(444);
		System.out.println("Second List "+slist);
		
		System.out.println("Add List into List");
		flist.addAll(5,slist);
		System.out.println(flist);
		
		flist.remove(10);
		System.out.println("List after remove 120  " +flist);
		
		System.out.println("Get Element at 4th Index " +flist.get(4));
		
		if(flist.contains(333))
		{
			System.out.println("Value Present");
		}
		else
		{
			System.out.println("Value not Present");
		}
		
		
	}

}
