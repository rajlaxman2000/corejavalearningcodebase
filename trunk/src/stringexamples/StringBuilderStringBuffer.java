package stringexamples;

import java.awt.Point;

public class StringBuilderStringBuffer {
	
	public static void main(String[] args){
		int N = 77777777;
        long t;
       
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            /*
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
          */
            for (int i = N; i >=0;i--) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
       
       
        
            StringBuilder sb1 = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
            	sb1.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
             
          
            
            
        
	}

}
