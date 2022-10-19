package Collection;

import java.util.ArrayList;

public class ArraytoList {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,9};
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int b:a)
		{
			list.add(b);
		}

		System.out.println(list);
		int []c=new int [list.size()];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=list.get(i);
		}
		
		for(int ss:c)
		{
			System.out.println(ss);
		}
	}

}
