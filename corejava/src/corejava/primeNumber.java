package corejava;



public class primeNumber {
  
	  
    public static boolean isprime (int number) {
    	if (number<=1) {
    		return false;
			
		}else {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					return false;
				}
			}
			return true;
		}
    }
	
	
	public static void main(String[] args) {
     
      System.out.println(isprime(20));
	}
}
