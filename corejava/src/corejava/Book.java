package corejava;

import java.awt.image.TileObserver;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class Book {
      String title;
      String author;
      int price;
      
      Book( String title,String author,int price){
    	  this.title =title;
    	  this.author =author;
    	  this.price=price;
      }
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + author + price;
	}
	
	
	
	  public static void main(String[] args) {
			Book b1 = new Book("mahabharat", "aaryabhat", 350);
			
			LinkedList<Book> b = new LinkedList<Book>();
			b.add(b1);
			System.out.println(b);
		}
}
