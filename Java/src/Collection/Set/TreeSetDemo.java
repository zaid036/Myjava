package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetDemo {
	public static void main(String[] args) {

		TreeSetDemo s=new TreeSetDemo();
		System.out.println(s.getClass().getSimpleName());
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(2);
		ts.add(3);
		ts.add(0);
		ts.add(0);
		ts.add(-1);
		ts.add(-2);
		ts.add(-2);

		System.out.println(ts);
	ts.remove(1);
    System.out.println(ts.getClass());

		Iterator<Integer> desce = ts.descendingIterator();
		while (desce.hasNext()) {

			System.out.print(desce.next() + ", ");

		}
		System.out.println();
		Stream<Integer> stream = ts.stream();
		
		long count = stream.count();
		System.out.println(count);
	
		

	}

}
