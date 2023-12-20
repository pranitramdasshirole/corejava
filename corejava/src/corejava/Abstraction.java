package corejava;

abstract class Animal2{
	public abstract void sound();
	
	public void sleep() {
		System.out.println("i am sleeping");
	}
	
	
	
}

class tiger2 extends Animal2{
	   public void sound() {
		   System.out.println("i am tiger ");
	   }
}

public class Abstraction {
    public static void main(String[] args) {
         
      tiger2 T1 = new tiger2();
      T1.sound();
      T1.sleep();
    	
	}
}
