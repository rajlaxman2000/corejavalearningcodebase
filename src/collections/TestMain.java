package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import corejava.Employee;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		StudentCol std1= new StudentCol(1,"Rajesh", 20);
		StudentCol std2= new StudentCol(2,"Arsin", 21);
		StudentCol std3= new StudentCol(3,"Boby", 22);
		StudentCol std4= new StudentCol(4,"Catherina", 23);
		StudentCol std5= new StudentCol(5,"Phani", 24);
		StudentCol std6= new StudentCol(6,"Geetha", 25);
		students.add(std1);
		students.add(std2);
		students.add(std3);
		*/
		List<StudentCol> students = new ArrayList<StudentCol>(11);
		
		List<StudentCol> students1 = new ArrayList<StudentCol>(20);
		for(int i=0; i<10;i++){
			StudentCol student = new StudentCol();
			student.setSno(i);
			student.setName("Student Name-"+i);
			student.setAge(i+10);
			students.add(student);
		}
		
		students1.addAll(students);
		
		/*
		StudentCol std1= new StudentCol(100,"Rajesh", 50);
		students.add(4, std1);
		*/
		students1.remove(0);
		
				
				
		/*
		for(StudentCol std:students){
			System.out.println("Student Sno  ::"+std.getSno());
			System.out.println("Student name :: "+std.getName());
			System.out.println("Student age  :: "+std.getAge());
		}
		
		System.out.println("*****************************************************");
		System.out.println("Second array list ::  students 1");
		for(StudentCol std:students1){
			System.out.println("Student Sno  ::"+std.getSno());
			System.out.println("Student name :: "+std.getName());
			System.out.println("Student age  :: "+std.getAge());
		}
	
	*/
	
		/*
		 * 1-Apple-10, 2-Baby-20, 3-Cat-30, 4-Dady-40, 5-Nani-50
		 */
	String[] names = {"Nani","Apple", "Cat", "Dady", "Baby"};
	int[] ages = {5,10,35,50,70};
	int[] snums = {5,1,3,4,2};
	/*
	String str1 = new String("Geetha Sankineni");
	String str2 = new String("Geetha Batra");
	String str3 = new String("Ramesh Batra");
	*/
	ArrayList<StudentCol> studentsSort  = new ArrayList<StudentCol>();
	
	for(int i=0; i<5;i++){
		StudentCol student3 = new StudentCol();
		student3.setSno(snums[i]);
		student3.setName(names[i]);
		student3.setAge(ages[i]);
		studentsSort.add(student3);
	}
	/*
	StudentCol std = new StudentCol();
	
	Employee employee = new Employee();
		
	std.setAge(10);
	std.setName("Apple");
	std.setSno(2);	
	*/
	Collections.sort(studentsSort);
	
	
	//System.out.println(studentsSort.contains(std));
	System.out.println("**** I am trying to sort ****");
	for(StudentCol studnt : studentsSort){
		System.out.println("Student Sno  ::"+studnt.getSno());
		System.out.println("Student name :: "+studnt.getName());
		System.out.println("Student age  :: "+studnt.getAge());
	}
	}	

}
