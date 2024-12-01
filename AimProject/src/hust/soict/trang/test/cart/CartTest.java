package hust.soict.trang.test.cart;

import hust.soict.trang.aims.cart.Cart;

import hust.soict.trang.aims.media.DigitalVideoDisc;

public class CartTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new dvd object and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", 
				"Science Fiction", "George Luscas", 87, 24.95f);
		cart.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addMedia(dvd3);
		
		// Test the print method
		cart.print();
		// Test the search id
		cart.searchById(1);
		cart.searchById(0);
		// Test search by title
		cart.searchByTitle("abc");
	}

}