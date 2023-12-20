package corejava;

interface  birds{
	public void FLY();
	public void Sleep();
}

class parrot implements birds{
	public void FLY() {
		System.out.println("hello");
	}
	
	public void Sleep() {
		System.out.println("bye");
	}
}












public class Interface {
     public static void main(String[] args) {
		parrot P1 =new parrot();
		P1.FLY();
		P1.Sleep();
	}
}
