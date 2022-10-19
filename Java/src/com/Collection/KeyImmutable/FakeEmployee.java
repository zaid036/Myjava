package com.Collection.KeyImmutable;

import java.util.Objects;

public class FakeEmployee {

	private String fakename;
	public FakeEmployee(String name) {
	
		this.fakename=name;
	}
	public String getFakename() {
		return fakename;
	}
	public void setFakename(String fakename) {
		this.fakename = fakename;
	 
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fakename);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FakeEmployee other = (FakeEmployee) obj;
		return Objects.equals(fakename, other.fakename);
	}
	
	
	

}
