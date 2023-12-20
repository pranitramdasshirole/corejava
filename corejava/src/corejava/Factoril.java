package corejava;

import java.util.Iterator;

public class Factoril {
       
	
	public static void factorial(int number) {
		int res =1;
		for(int i=1;i<=number;i++) {
			res=res*i;
		}
		System.out.println(res);
	}
	
	
	
	
	public static void main(String[] args) {
		factorial(5);
	}
}		
