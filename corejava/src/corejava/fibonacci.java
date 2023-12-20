package corejava;

import java.util.Iterator;

public class fibonacci {
    
	
	
	
	
	public static void fibonacci2(int number) {
		int n1 =0;
		int n2= 1;
		int n3;
		System.out.print(n1+ " ");
		System.out.print(n2+ " " );
        
		
		for(int i=2;i<number;i++) {
			 n3=n1+n2;
			System.out.print(n3+ " " );
			n1=n2;
			n2=n3;
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		fibonacci2(10);
	}
}
