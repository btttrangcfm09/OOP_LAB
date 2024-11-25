package hust.soict.trang.aims.store;

import hust.soict.trang.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_ORDERED = 1000;
	int qtyOrdered = 0;
	DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public void addDVS(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsInStore[qtyOrdered] = disc;
			++qtyOrdered;
			System.out.println("The disc "+disc.getTitle()+" has been added.");
		}
		else {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is array
	public void addDVD(DigitalVideoDisc [] dvList){
		int numberDv = dvList.length, index = 0;
		if(numberDv == 0) {
			System.out.println("The List is empty.");
		}
		while(qtyOrdered < MAX_NUMBERS_ORDERED && index < numberDv) {
			itemsInStore[qtyOrdered] = dvList[index];
			System.out.println("The disc " + dvList[index].getTitle() + " has been added.");
			++qtyOrdered;
			++index;
		}
		if(qtyOrdered == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is arbitrary number
	public void addDVD(DigitalVideoDisc disc1,DigitalVideoDisc ...disc) {
		// when add disc1
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsInStore[qtyOrdered] = disc1;
			System.out.println("The disc " + disc1.getTitle() + " has been added.");
			++qtyOrdered;
		}
		else System.out.println("The cart is almost full.");
		// when add Disc List
		int numberDv = disc.length, index = 0;
		if(numberDv == 0) {
			System.out.println("The List is empty.");
		}
		while(qtyOrdered < MAX_NUMBERS_ORDERED && index < numberDv) {
			itemsInStore[qtyOrdered] = disc[index];
			System.out.println("The disc " + disc[index].getTitle() + " has been added.");
			++qtyOrdered;
			++index;
		}
		if(qtyOrdered == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int xuathien = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsInStore[i].equals(disc)) {
				int j = i;
				for(j = i; j < qtyOrdered - 1; ++j) {
					itemsInStore[j] = itemsInStore[j+1];
				}
				itemsInStore[j] = null;
				System.out.println("The disc "+disc.getTitle()+" has been removed.");
				xuathien = 1;
				--qtyOrdered;
				break;
			}
		}
		if(xuathien == 0) System.out.println("The disc hasn't been exsited in the List.");
	}
	// method to print the list of ordered items of a store
	public void print() {
		System.out.println("*********************************CART*********************************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < qtyOrdered; ++i) {
			System.out.println(i+1+". "+itemsInStore[i].toString());
			
		}
//		float totalcost = totalCost();
//		System.out.println("Total cost: " + "[" + totalcost + "]");
		System.out.println("************************************************************************");
	}	
}
