package corejava;

public class Reverse {
   public static void main(String[] args) {
	String name = "pranit";
	String newname = null;
	
	char ch;
	for(int i=1;i<name.length();i++) {
		ch =name.charAt(i);
		newname= ch+newname;
		
	}
	System.out.println(newname);
}
}
