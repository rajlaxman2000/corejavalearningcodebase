package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args){
		/*
		String first = "xyz";    
		String second = "xyz"; 
		String third;
		//second = "abc";
		third = second.concat("123");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		*/
		
		Map<String, StudentForMap> studentsMap = new HashMap<String, StudentForMap>();
		Map<Integer, StudentForMap> studentsMapSno = new HashMap<Integer, StudentForMap>();
		String[] names = {"Nani","Apple", "Cat", "Dady", "Baby","Nani"};
		int[] ages = {5,10,35,50,70,66};
		int[] snums = {5,1,3,4,1,6};
		/*
		String str1 = new String("Geetha Sankineni");
		String str2 = new String("Geetha Batra");
		String str3 = new String("Ramesh Batra");
		*/
				
		for(int i=0; i<6;i++){
			StudentForMap student = new StudentForMap();
			student.setSno(snums[i]);
			student.setName(names[i]);
			student.setAge(ages[i]);
			studentsMap.put(student.getName(),student);
			studentsMapSno.put(student.getSno(), student);
		}
		System.out.println("******* Student Map where as key is student name");		
		System.out.println(studentsMap);
		
		System.out.println("******* Student Map where as key is student no");
		System.out.println(studentsMapSno);
		//The method put(String, StudentForMap) in the type Map<String,StudentForMap> is not applicable for the arguments (int, StudentForMap)
		
		
	}

}
