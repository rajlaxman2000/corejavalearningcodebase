package interFaceAbstart;

public class EmployeeDetails {
	
	private String name;
	private long id;
	private int age;
	
	
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		if (age!=0){
			return age;
		}else{
			return 100000;
		}
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
			if (age>18){
				this.age = age;
			}else{
				
				System.out.println("According to child labour act u can't do this");
			}
		}	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}
	private long salary;
	
	
		
	

}
