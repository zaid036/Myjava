package Collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		list.add("Zaid");
		list.add("Khan");
		list2.add("Zaid");
		list2.add("Khan");
		System.out.println(list.hashCode());
		System.out.println(list.equals(list2));
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
	}

}
