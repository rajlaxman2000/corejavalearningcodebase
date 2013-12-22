package collections;

import java.util.ArrayList;

public class HashSetExample {

	
	public static void main(String[] args){
		String[] names = {"Nani","Apple", "Cat", "Dady", "Baby", "Nani"};
		int[] ages = {5,10,35,50,70,50};
		int[] snums = {5,1,3,4,2,5};
		
ArrayList<StudentCol> studentsList  = new ArrayList<StudentCol>();
		
		for(int i=0; i<5;i++){
			StudentCol student3 = new StudentCol();
			student3.setSno(snums[i]);
			student3.setName(names[i]);
			student3.setAge(ages[i]);
			studentsList.add(student3);
		}
	}
}
