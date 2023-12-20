package corejava;

import javax.sql.rowset.JoinRowSet;

public class StudentException extends RuntimeException {
    String name;
    int age;
    int marks;
    
    
    
    public StudentException(String name,int age,int marks) {
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
    
    public  StudentException(String msg) {
    	super(msg);
    }
	
	
	public static void main(String[] args) {
		int marks = 20;
		try {
			if (marks >0) {
				System.out.println("passing marks");
				
			}
			else {
				throw new StudentException("fail");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
