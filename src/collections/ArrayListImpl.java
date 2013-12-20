package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {
		
	StudentCol std1= new StudentCol(1,"Rajesh", 20);
	StudentCol std2= new StudentCol(2,"Arsin", 21);
	StudentCol std3= new StudentCol(3,"Boby", 22);
	StudentCol std4= new StudentCol(4,"Catherina", 23);
	StudentCol std5= new StudentCol(5,"Phani", 24);
	StudentCol std6= new StudentCol(6,"Geetha", 25);
	
	List<StudentCol> students = new ArrayList<StudentCol>(10);
	
	String[] names = {"Rajesh", "Raghu"};
	int[] ages = {10,5,15,20,30,50};
	
	
}
