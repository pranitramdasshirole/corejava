package corejava;

public class constructor {
    String myname;
    int myage;
	  
     
     
     public constructor(String name,int age) {
		 myname=name;
		 myage =age;
	  }
	
	
	
	
	
	public static void main(String[] args) {
		constructor c1=new constructor("pranit",20);
		System.out.println(c1.myage);
		System.out.println(c1.myname);
	}
}
