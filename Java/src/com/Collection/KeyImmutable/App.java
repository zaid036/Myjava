package com.Collection.KeyImmutable;

import java.util.HashMap;
import java.util.Map;

public class App {
	
	public static void main(String[] args) {
		Map<Employee, String> map=new HashMap<>();
		
		FakeEmployee femp=new FakeEmployee("Zaid");
		System.out.println(femp.hashCode());
		Employee emp=new Employee("Zaid");
		//Employee emp1=femp;
		//map.put(emp1, "Khan");
		femp.setFakename("Tanzeel");
		//System.out.println(map.get(emp1));
		System.out.println("**********");
		System.out.println(femp.hashCode());
		System.out.println(emp.hashCode());
		//System.out.println(emp1.hashCode());
		
	}

}
