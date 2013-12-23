package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String[] args){
		String[] names = {"Apple", "Cat", "Dady", "Baby", "Nani","Nani"};
		int[] ages = {10,35,50,70,50,50};
		int[] snums = {1,3,4,2,5,5};		
		ArrayList<StudentForSet> studentsList  = new ArrayList<StudentForSet>();		
		for(int i=0; i<names.length;i++){
			StudentForSet student = new StudentForSet();
			student.setSno(snums[i]);
			student.setName(names[i]);
			student.setAge(ages[i]);
			studentsList.add(student);
		}
		System.out.println("***************Printing List ***************");
		System.out.println(studentsList);
		
		HashSet<StudentForSet> studentsHashSet = new HashSet<StudentForSet>();
		
		studentsHashSet.addAll(studentsList);
		System.out.println("***************Printing Hash Set ***************");
		System.out.println(studentsHashSet);
		
		LinkedHashSet<StudentForSet> studentsLinkedHashSet = new LinkedHashSet<StudentForSet>();
		
		studentsLinkedHashSet.addAll(studentsList);
		System.out.println("***************Printing Linked Hash Set ***************");
		System.out.println(studentsLinkedHashSet);
		
		TreeSet<StudentForSet> studentsTreeSet = new TreeSet<StudentForSet>();
		
		studentsTreeSet.addAll(studentsList);
		System.out.println("***************Printing Tree Set ***************");
		System.out.println(studentsTreeSet);
		
		
		
	}
}
