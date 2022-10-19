package com.Collection.KeyImmutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableKey {
	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		Employee emp = new Employee("Zaid");
		System.out.println(emp.hashCode());
		map.put(emp, "Khan");
		System.out.println(map);
		//emp.setName("Tanzeel");
		System.out.println(emp.hashCode());
		System.out.println(map);
		System.out.println(map.get(emp));
		System.out.println(map);

	}

}
