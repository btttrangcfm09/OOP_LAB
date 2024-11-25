package hust.soict.trang.aims.test.cart;

import hust.soict.trang.aims.cart.Cart;
import hust.soict.trang.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new dvd object and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", 
				"Science Fiction", "George Luscas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		// Test the print method
		cart.print();
	}

}