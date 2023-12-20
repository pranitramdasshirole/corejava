package corejava;

public class pattern_square {
          public static void main(String[] args) {
			
        	  int rows = 5; // Number of rows in the pattern
              
              for (int i = 1; i <= rows; i++) {
                  for (int j = 1; j <= 6; j++) {
                      if (i == 1 || i == rows || j == 1 || j == 6) {
                          System.out.print("*");
                      } else {
                          System.out.print(" ");
                      }
                  }
                  System.out.println();
              }
        	  
        	  
        	  
		}
}
