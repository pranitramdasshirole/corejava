package corejava;



public class Object {
   
	
	int age;
	public  void printage(int age) {
		this.age = age;
	}
	
	
	
	
	
	public static void main(String[] args) {
	Object a1 = new Object();
	a1.age=20;
	System.out.println(a1.age);
}

}
