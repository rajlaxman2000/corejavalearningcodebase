package collections;

public class Name implements Comparable<Name>{
	
	private String firstName;
	private String lastName;
	
	public int compareTo(Name obj){
		
		return this.firstName.compareTo(obj.firstName);
	}
	
	public Name(){
		
	}
	
	public Name(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}

	
	public String toString(){
		
		return this.firstName+" "+this.lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

}
