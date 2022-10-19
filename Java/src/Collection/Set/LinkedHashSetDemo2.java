package Collection.Set;

import java.util.*;

import com.Collection.KeyImmutable.Employee;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		
		Set<Integer> ls=new LinkedHashSet<>();
		ls.add(101);
		ls.add(103);
		ls.add(104);
		ls.add(102);
		ls.add(106);
		ls.add(105);
		ls.add(101); //duplicate
		
		System.out.println(ls);
		
		Set<Employee> ls1=new LinkedHashSet<>();
		 Employee e1=new Employee("Zaid");
		 Employee e2=new Employee("Tanzeel Khan");
		 Employee e3=new Employee("Hassan");
		 Employee e4=new Employee("Junaid");
		 Employee e5=new Employee("Ajaz");
		 Employee e6=new Employee("Ajaz");
		ls1.add(e1);
		ls1.add(e2);
		ls1.add(e3);
		ls1.add(e4);
		ls1.add(e5);
		ls1.add(e6);
		
		System.out.println(ls1);
		
		TreeSet<Employee> ts=new TreeSet<>(ls1);
		
		System.out.println(ts);
		
	}
}
