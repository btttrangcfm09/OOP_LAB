package aimproject;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			++qtyOrdered;
			System.out.println("The disc "+disc.getTitle()+" has been added.");
		}
		else {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is array
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvList){
		int numberDv = dvList.length, index = 0;
		if(numberDv == 0) {
			System.out.println("The List is empty.");
		}
		while(qtyOrdered < MAX_NUMBERS_ORDERED && index < numberDv) {
			itemsOrdered[qtyOrdered] = dvList[index];
			System.out.println("The disc " + dvList[index].getTitle() + " has been added.");
			++qtyOrdered;
			++index;
		}
		if(qtyOrdered == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is arbitrary number
	public void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc ...disc) {
		// when add disc1
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc1;
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
			itemsOrdered[qtyOrdered] = disc[index];
			System.out.println("The disc " + disc[index].getTitle() + " has been added.");
			++qtyOrdered;
			++index;
		}
		if(qtyOrdered == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	//2.2 Overloading by differing the number of parameters
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd1;
			System.out.println("The disc " + dvd1.getTitle() + " has been added.");
			++qtyOrdered;
		}
		else System.out.println("The cart is almost full.");
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd2;
			System.out.println("The disc " + dvd2.getTitle() + " has been added.");
			++qtyOrdered;
		}
		else System.out.println("The cart is almost full.");
	}
	
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int xuathien = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].equals(disc)) {
				int j = i;
				for(j = i; j < qtyOrdered - 1; ++j) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[j] = null;
				System.out.println("The disc "+disc.getTitle()+" has been removed.");
				xuathien = 1;
				--qtyOrdered;
				break;
			}
		}
		if(xuathien == 0) System.out.println("The disc hasn't been exsited in the List.");
	}
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	public void displayDigitalVideoDisc() {
		for(int i = 0; i < qtyOrdered; ++i) {
			System.out.println(itemsOrdered[i].toString());
			
		}
	}
	public void numberOfDisc() {
		System.out.println(qtyOrdered);
	}

	
}
