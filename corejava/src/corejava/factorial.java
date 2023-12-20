package corejava;



 class factorial {
	  
       public static void factorialone() {
    	   int n=5;
    	   int result =1;
    	   
    	   for(int i=1;i<=n;i++) {
    		  result=result*i;
    		   
    	   }
    	   System.out.println(result);
    	   
       }
	
    
       
       
       public static void main(String[] args) 
       {
		factorialone();
	   
       
       }
}