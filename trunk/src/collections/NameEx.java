package collections;

public class NameEx{
	
	private String firstName;
	private String lastName;
	
	
	public int hashCode(){
		
		return this.firstName.hashCode()+this.lastName.hashCode();
	}
	
	public NameEx(){
		
	}
	
	public boolean equals(Object obj){
		NameEx name = (NameEx) obj;
		
		if( name.getFirstName().compareTo(this.firstName)==0 && name.getLastName().compareTo(this.lastName)==0){
			return true;
		}
		
		return false;
	}
	
	
	
	public NameEx(String firstName, String lastName){
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
