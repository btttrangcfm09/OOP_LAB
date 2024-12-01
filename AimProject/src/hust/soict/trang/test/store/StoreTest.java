package hust.soict.trang.test.store;

import hust.soict.trang.aims.media.DigitalVideoDisc;
import hust.soict.trang.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		
		// Create new dvd object and add them to the Store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", 
				"Science Fiction", "George Luscas", 87, 24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		store.addMedia(dvd3);	
		store.print();
		// remove
		store.removeMedia(dvd3);
		store.print();
	}

}



