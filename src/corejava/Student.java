package corejava;

import java.lang.reflect.Array;
import java.util.ArrayList;
	
public class Student {
	
	static class Test{
		
	}
	
	String name;
	Long id;
	int age;
	final int x=10; 
	int a[]= new int[10];
	public String toString(){
		System.out.println("final variable value : "+x);
		return "My own text";
	}
	
	public int findArray(int[] array, int[] subArray) {

       
        if (array.length == 0 || subArray.length == 0 || array.length < subArray.length) {
            return -1;
        }      

        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == subArray[0]) {

                boolean res = true;
                for (int j = 0; j < subArray.length; j++) {
                   
                    if (array.length <= i+j || subArray[j] != array[i+j]) {
                        res = false;
                        break;
                    }
                }
                
                if (res) {
                    return i;
                }

            }
        }
        return -1;
    }
}



