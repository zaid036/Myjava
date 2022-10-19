package Collection.Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> ss = new LinkedHashSet<>();

		ss.add("Zaid");
		ss.add("Tanzeel");
		ss.add("Zaid Khan");
		ss.add("Hassan");
		ss.add("Hassan");
		ss.add("Kashif");
		ss.add("Kashif");
		ss.add("Junaid");

		System.out.println(ss);

		TreeSet<String> ts = new TreeSet<>(ss);

		System.out.println(ts);

	}
}
