package collections;


public class StudentForSet implements Comparable<StudentForSet>{

	
	private int sno;
	
	private String name;
	
	private int age;
	
	
	public String toString(){
		return "Sno::"+this.sno+", Name::"+this.name+", Age::"+this.age+"\n";
	}
	
	public int hashCode(){
		return sno+age+this.name.hashCode();
	}
	
	public boolean equals(Object obj) {
		
		boolean res= false;
		if (obj instanceof StudentForSet) {			
			StudentForSet student  = (StudentForSet)obj;
				if( student.getAge()==this.age 
						&& student.sno==this.sno &&
						student.getName().equalsIgnoreCase(this.name)){
					res=true;	
				}	
		}
		return res;
	}
	

	@Override
	public int compareTo(StudentForSet std) {
		
		return this.sno-std.getSno();
		//return this.age-std.age;
		//return (this.name).compareTo(std.getName());
	}

	public StudentForSet(){
		
	}
	
	public StudentForSet(int sno, String name, int age){
		this.sno=sno;
		this.name=name;
		this.age=age;
	}


	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	


}

