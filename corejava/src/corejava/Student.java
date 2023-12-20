package corejava;

public class Student {
 String name;
 int rollnumber;
 char grade;
 
 static int totalstudents = 0;
 
 public Student(String name,int rollnumber,char grade) {
	this.name =name;
	this.rollnumber=rollnumber;
	this.grade=grade;
	totalstudents++;
	 
	 
}
 
  static int getTotalStudents() {
	 return totalstudents;
	 
	 }
 
 void  studentDetails() {
	 System.out.println("name: " + name);
	 System.out.println("rollnumber:  " + rollnumber);
	 System.out.println("grade:  " + grade);
 }
 
 
 public static void main(String[] args) {
	Student s1= new Student("pranit", 68, 'A');
	Student s2= new Student("sonali", 69, 'A');
	Student s3= new Student("Abhishek", 70, 'A');
	s1.studentDetails();
	System.out.println("                  ");
	s2.studentDetails();
	System.out.println("                   ");
	s3.studentDetails();
	System.out.println("                    ");
	
	System.out.println("Total student : " + Student.getTotalStudents());
	
	
	
	
}
 
}
