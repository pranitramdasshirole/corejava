package corejava;

class animals{
	void sound() {
		System.out.println("Animals sound is big");
	}
}

class lion extends animals{
	void sound() {
		System.out.println("lion is rrrrrrrr");
	}
}

class tiger extends animals{
	void  sound() {
		System.out.println("tiger is rrrrrrrr");
	}
}










public class polymorphism {
   public static void main(String[] args) {
	animals A1 =new animals();
	animals A2 =new lion();
	animals A3 =new tiger();
	A1.sound();
	A2.sound();
    A3.sound();	
}
}
