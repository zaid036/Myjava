package Collection;

import java.util.ArrayList;

class Student{
	
	int id;
	String name, address;
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

public class UserDefineObjectDemoByArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(101, "Zaid Khan", "Sakinaka 72"));
		list.add(new Student(102, "Tanzeel Khan", "Vikroli 79"));
		list.add(new Student(103, "Hassan", "90 feet Sakinaka 72"));
		list.add(new Student(104, "Nehal", "Dharvi 17"));
		list.add(new Student(105, "Junaid", "Sakinaka 72"));
		
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			System.out.println(s.id+" " +s.name+" "+s.address);
			
		}
		
		ArrayList<Object>list2=new ArrayList<>();
		list2.add(list);
		
		
		System.out.println(list2);
		
	}
}
