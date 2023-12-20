package corejava;

import java.util.Scanner;

public class scanner {
   public static void main(String[] args) {
	   
	   Scanner ob = new Scanner(System.in);
	   
	   System.out.println("Enter two values");
	   int a =ob.nextInt();
	   int b= ob.nextInt();
	   
	   int c = a+b;
	   
	   System.out.println(c);
	   
	
}
}
