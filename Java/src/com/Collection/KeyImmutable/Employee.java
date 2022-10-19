package com.Collection.KeyImmutable;

import java.util.Objects;

public final class Employee implements Comparable<Employee> {

	private final String name;

	public Employee(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// public void setName(String name) { this.name=name; }
	  
	 

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}

}
