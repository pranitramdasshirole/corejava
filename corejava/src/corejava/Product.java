package corejava;

public class Product {
      int productid;
      String productname;
      int price;
      int quantityinstock;
      
      
      static int totalproducts;
      
      
      Product(int productid, String productname,int price,int quantityinstock){
    	  this.productid=productid;
    	  this.productname=productname;
    	  this.price=price;
    	  this.quantityinstock=quantityinstock;
    	  totalproducts++;
      }
      
      static int  gettotalproducts() {
    	  return totalproducts;
      }
      
      
      void sellproduct(int sellnumber) {
    	  int reaminingstock = quantityinstock-sellnumber;
    	  System.out.println(reaminingstock);
      }
      
      
      
      
      public static void main(String[] args) {
		
    	  Product p1=new Product(01, "cars", 500,50);
          Product p2=new Product(02, "bikes", 300,100);
          
          p1.sellproduct(10);
          
         
          System.out.println(Product.gettotalproducts());
    	  
    	  
    	  
    	  
	}
}
