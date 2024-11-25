package aimproject;

import java.util.Arrays;

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
		System.out.println("STT:"+"\t\t"+
				           "Title:"+"\t\t\t"+
				           "Category:"+"\t\t"+
				           "Director:"+"\t\t"+
				           "Length:"+"\t\t"+
				           "Cost:"+"\n");
		for(int i = 0; i < qtyOrdered; ++i) {
			System.out.println(i+1+"\t\t"+
		                       itemsOrdered[i].getTitle()+"\t\t"+
					           itemsOrdered[i].getCategory()+"\t\t"+
					           itemsOrdered[i].getDirector()+"\t\t"+
					           itemsOrdered[i].getLength()+"\t\t"+
					           itemsOrdered[i].getCost()+'\n');
			
		}
	}

	
}
