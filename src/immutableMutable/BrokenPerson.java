package immutableMutable;
import java.util.Date;

public final class BrokenPerson{
	private String firstName;
	private String lastName;
	private Date dob;

	public BrokenPerson( String firstName, String lastName, Date dob){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;		
	}

	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public Date getDOB(){
		return this.dob;
	}
}
