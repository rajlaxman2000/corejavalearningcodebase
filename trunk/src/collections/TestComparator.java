package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
	
	public static void main(String[] args){
		String[] names = {"Nani","Apple", "Cat", "Dady", "Baby"};
		int[] ages = {5,10,35,50,70};
		int[] snums = {5,1,3,4,2};
		
		ArrayList<StudentCol> studentsSort  = new ArrayList<StudentCol>();
		
		for(int i=0; i<5;i++){
			StudentCol student3 = new StudentCol();
			student3.setSno(snums[i]);
			student3.setName(names[i]);
			student3.setAge(ages[i]);
			studentsSort.add(student3);
		}
		
		Collections.sort(studentsSort, new AgeComparator());
		//Collections.sort(studentsSort);
		System.out.println("**** I am trying to sort ****");
		for(StudentCol studnt : studentsSort){
			System.out.println("Student Sno  ::"+studnt.getSno());
			System.out.println("Student name :: "+studnt.getName());
			System.out.println("Student age  :: "+studnt.getAge());
		}
		
	}
}	
	
	class SnoComparator implements Comparator<StudentCol>{
		@Override
		public int compare(StudentCol std1, StudentCol std2) {			
			return std1.getSno()-std2.getSno();
		}
	}
	
	class AgeComparator implements Comparator<StudentCol>{
		@Override
		public int compare(StudentCol std1, StudentCol std2) {			
			return std1.getAge()-std2.getAge();
		}
	}
	
	class NameComparator implements Comparator<StudentCol>{
		@Override
		public int compare(StudentCol std1, StudentCol std2) {			
			return std1.getName().compareTo(std2.getName());
		}
	}


