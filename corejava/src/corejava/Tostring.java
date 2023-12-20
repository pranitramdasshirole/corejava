package corejava;

public class Tostring {
    String name;
    int age;
    int rollno;
    
    
    public Tostring(String name,int age,int rollno) {
		this.age=age;
		this.name=name;
		this.rollno=rollno;
	}
    @Override
	public String toString() {
		return "name : " +name + " age : "+age+" roll no :" + rollno;
	}
	
	public static void main(String[] args) {
	   Tostring s1= new Tostring("pranit", 22, 68);	
	   System.out.println(s1);   
	   
	}
}
