package hust.soict.trang.test.cart;

import hust.soict.trang.aims.cart.Cart;
import hust.soict.trang.aims.media.Media;
import hust.soict.trang.aims.media.CompactDisc;
import hust.soict.trang.aims.media.Book;
import hust.soict.trang.aims.media.DigitalVideoDisc;
import java.util.ArrayList;
public class CartTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new dvd object and add them to the cart
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//				"Animation", "Roger Allers", 87, 19.95f);
//		cart.addMedia(dvd1);
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", 
//				"Science Fiction", "George Luscas", 87, 24.95f);
//		cart.addMedia(dvd2);
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//				"Animation", 18.99f);
//		cart.addMedia(dvd3);
//		
//		// Test the print method
//		cart.print();
//		// Test the search id
//		cart.searchById(1);
//		cart.searchById(0);
//		// Test search by title
//		cart.searchByTitle("abc");
		// Test for override equals in Media
//		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King");
//		cart.addMedia(dvd4);
		// Test for polymorphism
		ArrayList<Media> mediae = new ArrayList<Media>();
		// create some media 
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King 3",
				"Animation", "Roger Allers", 100, 30.95f);
		mediae.add(dvd5);
		CompactDisc CD1 = new CompactDisc("The label", "music", 30.5f);
		mediae.add(CD1);
		Book book1 = new Book("And then there were none.", "Ditective", 30f);
		mediae.add(book1);
		for(Media m:mediae) {
			System.out.println(m.toString());
		}
	}

}
