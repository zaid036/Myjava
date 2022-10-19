package Collection.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Random r=new Random();
		HashSet<Integer> s=new HashSet<>();
		
		for(int i=1;i<=10;i++)
		{
			int num=r.nextInt(50);
			
			s.add(num);
			System.out.print(num+", ");
		}
		System.out.println();
		System.out.println(s);
		
		HashSet<String>ss=new HashSet<>();
		ss.add("Zaid");
		ss.add("Tanzeel");
		ss.add("Zaid Khan");
		ss.add("Hassan");
		ss.add("Hassan");
		ss.add("Kashif");
		ss.add("Kashif");
		ss.add("Junaid");
		System.out.println();
		System.out.println(ss);
		
	}
}
