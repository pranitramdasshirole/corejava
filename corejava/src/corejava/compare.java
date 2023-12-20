package corejava;

public class compare {
   public static void main(String[] args) {
	String name = "pranit";
	String name2= "pranit";
	String name3 = new String("pranit");
	
	System.out.println(name==name3);
	System.out.println(name.equals(name3) );
//	System.out.println(name.equals(name2));
}
}
