package corejava;



public class encapsulation {
    private int number;
    
    
    public void setValue(int n) {
    	number=n;
    }
    
    
    public int getValue() {
    	return number;
    }
	
	
	public static void main(String[] args) {
		encapsulation r = new encapsulation();
		
	r.number=100;
	System.out.println(r.number);
//		r.setValue(100);
//		System.out.println(r.getValue());
	}
	
	
	
	
}
