package corejava;

import java.util.Iterator;

public class Pattern {
           
	
	
	      public static void main(String[] args) {
	           int lines =7;
	    	  for(int i =2; i<=lines;i++) {
	    		  
	    		  
	    		  for (int j=2 ;j<=i;j++) {
	    			   if(i%2==0) {
	    				   System.out.print("*");
	    			   }else {
	    				   System.out.print("#");
	    			   }
	    		  }
	    		  System.out.println();
	    	  }
	    	  
	    	  
	    	  
	    	  
		
}
}


//for (int i = 1; i <= lines; i++) {
//    for (int j = 1; j <= 2 * i - 1; j++) {
//        System.out.print("*");
//    }

