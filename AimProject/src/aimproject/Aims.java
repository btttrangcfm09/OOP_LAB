package aimproject;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new cart
		Cart anOrder = new Cart();
//		
//		// Create new dvd object and add them to the cart
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
//				"Animation", "Roger Allers", 87, 19.95f);
//		anOrder.addDigitalVideoDisc(dvd1);
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", 
//				"Science Fiction", "George Luscas", 87, 24.95f);
//		anOrder.addDigitalVideoDisc(dvd2);
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
//				"Animation", 18.99f);
//		anOrder.addDigitalVideoDisc(dvd3);
//		
//		//print total cost of the items in the cart
//		System.out.println("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		
//		// remove dvd in the List
//		anOrder.removeDigitalVideoDisc(dvd3);
//		
//		// print the list of video after removing
//		anOrder.displayDigitalVideoDisc();
//		System.out.println(anOrder.toString());
		
		// Test for add dvList to DigitalVideoDisc
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Flower",
				"Animation", "Roger Alin", 90, 20.05f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Start Wars 2", 
				"Science Fiction", "George Luscas", 100, 25.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin 3",
				"Animation", 20.99f);
		DigitalVideoDisc dvList[] = {dvd4,dvd5,dvd6};
		anOrder.addDigitalVideoDisc(dvList);
		
		// Test for add arbitrary number of arguments
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Flower 1",
				"Animation", "Roger Alin", 100, 20.05f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Start Wars 3", 
				"Science Fiction", "George Luscas", 101, 25.95f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin 4",
				"Animation", 30.99f);
		anOrder.addDigitalVideoDisc(dvd7, dvd8,dvd9);
//		anOrder.displayDigitalVideoDisc();
		// Test for add differing the number of parameters
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Flower 2",
				"Animation", "Roger Alin", 200, 30.05f);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Start Wars 4", 
				"Science Fiction", "George Luscas", 300, 60.95f);
		anOrder.addDigitalVideoDisc(dvd8, dvd9);
		anOrder.displayDigitalVideoDisc();
	}

}
