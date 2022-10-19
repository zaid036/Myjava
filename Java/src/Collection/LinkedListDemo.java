package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		
		Object obj[]=new Object[100000];
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Object();
		}
		
		List<Object> list=new LinkedList<>();
		
		//List<Object> list=new ArrayList<>();
		for(Object ob:obj)
		{
			list.add(ob);
		}
		
		
		System.out.println(list.size());
		Object objj[]=new Object[list.size()];
		long start =System.currentTimeMillis();
		/*
		 * for(int i=100;i<list.size();i++) {
		 * 
		 * list.remove(i); }
		 */
		list.remove(2000);
		list.remove(3000);
		list.remove(4000);
		
		
		long end =System.currentTimeMillis();
		System.out.println("Time Taken : "+(end-start));
		

	}

}
