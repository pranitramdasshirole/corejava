package corejava;

import java.util.ArrayList;

public class Student1 {
      String name;
      int rollnumber;
      int marks;
      
      Student1(String name ,int rollnumber, int marks) {
    	  this.name = name;
    	 this.rollnumber = rollnumber;
    	 this.marks = marks;
      }
      
      public String toString() {
		return name + ":" + rollnumber + ":" + marks;
    	  
      }
      
      
      public static void avgMarks(ArrayList<Student1> s) {
    	  int total = 0;
    	  for(int i=0;i<s.size();i++) {
    		total = total+s.get(i).marks;
    	  }
    	  
    	  System.out.println("The avg marks is "+(total/s.size()));
      }
      
      
      public static void main(String[] args) {
		Student1  s1=new Student1("pranit", 58,50);
		Student1  s2=new Student1("pranit", 58,50);
		Student1  s3=new Student1("pranit", 58,50);
		Student1  s4=new Student1("pranit", 58,50);
	    
		ArrayList<Student1> s = new ArrayList<Student1>();
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		avgMarks(s);
		
		
      
      
       
      }
      
}
