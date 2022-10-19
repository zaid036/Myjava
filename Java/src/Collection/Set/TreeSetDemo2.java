package Collection.Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(101);
		ts.add(105);
		ts.add(103);
		ts.add(104);
		ts.add(102);

		System.out.println(ts);

		NavigableSet<Integer> desc = ts.descendingSet();
		System.out.println(desc);

		Iterator<Integer> it = ts.descendingIterator();
         while (it.hasNext()) {
			
        	 System.out.println(it.next());
        	 
		}
		
	}
}
