package Mypack1;

public class Strign {

	String name;
	
	
	  public Strign(String name) { super(); this.name = name; }
	
	@Override
	public String toString() {
		return "Strign [name=" + name + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
