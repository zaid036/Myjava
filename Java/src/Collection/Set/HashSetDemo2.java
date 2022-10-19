package Collection.Set;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		Student s = new Student();
		Student s1 = new Student();
		s.setId(101);
		s.setName("Zaid");
		s.setAge(25);
		s.setCity("Mumbai");

		s1.setId(101);
		s1.setName("Zaid");
		s1.setAge(26);
		s1.setCity("Mumbai");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		HashSet<Student> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s);

		System.out.println(hs);

	}

}
