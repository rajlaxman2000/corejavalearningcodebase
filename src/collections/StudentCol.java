package collections;


public class StudentCol implements Comparable<StudentCol> {
	
	private int sno;
	
	private String name;
	
	private int age;
	
	@Override
	public int compareTo(StudentCol std) {
		
		return this.sno-std.getSno();
		
		//return (this.name).compareTo(std.getName());
	}
	
	public StudentCol(){
		
	}
	
	public StudentCol(int sno, String name, int age){
		this.sno=sno;
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {
		
		boolean res= false;
		if (obj instanceof StudentCol) {			
			StudentCol student  = (StudentCol)obj;
				if( student.getAge()==this.age 
						&& student.sno==this.sno &&
						student.getName().equalsIgnoreCase(this.name)){
					res=true;	
				}	
		}
		return res;
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

