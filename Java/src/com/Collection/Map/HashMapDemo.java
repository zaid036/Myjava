package com.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Zaid", 101);
		map.put("Pawan", 103);
		map.put("Tanzeel", 102);
		map.put("Junaid", 105);
		map.put("Kashif", 104);
		map.put("Hassan", 104);
		map.put(null, null);
		
		System.out.println(map);
		Set set = map.entrySet();
		Iterator  it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry ss =(Map.Entry) it.next();
			
			System.out.println(ss.getKey()+" "+ss.getValue());
		}
		System.out.println(map.get("Hassan"));
		
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
