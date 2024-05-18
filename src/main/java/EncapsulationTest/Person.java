package EncapsulationTest;

public class Person {
	
	private String name; // restricted access as it is declared as private
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
		
	}

}
