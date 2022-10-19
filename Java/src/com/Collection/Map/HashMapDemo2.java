package com.Collection.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class HashMapDemo2 {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<>();
		mp.put(101, "Zaid");
		mp.put(102, "Tanzeel");
		mp.put(103, "Junaid");
		mp.put(104, "Hassan");
		mp.put(104, "Kashif");
		System.out.println(mp);
		System.out.println(mp.get(101));
		mp.replace(102, "Tanzeel Khan");

		System.out.println(mp);
		mp.replace(103, "Junaid", "Junaid 2010");
		System.out.println(mp);
		System.out.println(mp.size());
		Collection<String> cs = mp.values();
		Iterator<String> iterator = cs.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}

		for (Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
	}

}
