package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class StringSorts {

		public static void main(String[] args){
			
			String[] strName = {"Anil Reddy","Amit Reddy","Pahi Pasad","Raghu Prasad","Ziad Rao"};			
			// Amit Reddy, Anil Reddy, Phani Prasad, Raghu Prasad, Ziad Rao.
			// Pahni Prasad, Raghu Prasad, Ziad Rao, Amit Reddy, Anil Reddy.
			ArrayList<Name> names = new ArrayList<Name>();
			for (int i=0;i<5;i++){
				Name name = new Name();				
				String str1 = strName[i].split(" ")[0];
				String str2 = strName[i].split(" ")[1];
				
				name.setFirstName(str1);
				name.setLastName(str2);				
				names.add(name);				
			}		
			
			
			
			System.out.println("Sort by first name");
			Collections.sort(names);
			for(Name name:names){
				System.out.println(name);
			}
			System.out.println("Sort by last name");
			Collections.sort(names,new lastNameComparator());
			for(Name name:names){
				System.out.println(name);
			}
			
			
		}
}

	class  lastNameComparator implements Comparator<Name>{
		
		public int compare(Name name1, Name name2){
			return name1.getLastName().compareTo(name2.getLastName());
		}
		
	}




