package Basics;

public class Student {
	
	int id;
	String name;
	
	public Student (){
			
	}
	
	public Student (int id, String name){
		
		this.id = id;
		this.name = name;
	}

	public boolean equals (Object obj) {
		
		if (obj instanceof Student) {
						
			Student std =(Student) obj;
			/*
			int x = 1000;
			short y=10;
			
			x = y;
			y = (short)x;
			*/
			System.out.println("this id::"+this.id+"this name::"+this.name);
			if (std.id == this.id && std.name == this.name){
				
				return true;
			}else{
				return false;
			}
			
			/*
			if ( ( (Student) obj ).id == this.id && ((Student)obj).name == this.name ){
				return true;
			}else{
				return false;
			}*/
		}
		
		return false;
	}
	
}	

