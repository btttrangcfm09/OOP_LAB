package hust.soict.trang.aims.store;

import java.util.ArrayList;

import hust.soict.trang.aims.media.Media;


public class Store {
	public static final int MAX_NUMBERS_ORDERED = 1000;
	ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public void addMedia(Media media) {
		if(itemsInStore.size() < MAX_NUMBERS_ORDERED) {
			itemsInStore.add(media);
			System.out.println("The media "+media.getTitle()+" has been added.");
		}
		else {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is array
	public void addMedia(Media [] mediaList){
		int numberDv = mediaList.length, index = 0;
		if(numberDv == 0) {
			System.out.println("The List is empty.");
		}
		while(itemsInStore.size() < MAX_NUMBERS_ORDERED && index < numberDv) {
			itemsInStore.add(mediaList[index]) ;
			System.out.println("The media " + mediaList[index].getTitle() + " has been added.");
			++index;
		}
		if(itemsInStore.size() == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is arbitrary number
	public void addMedia(Media media1,Media ...media) {
		// when add media1
		if(itemsInStore.size() < MAX_NUMBERS_ORDERED) {
			itemsInStore.add(media1);
			System.out.println("The media " + media1.getTitle() + " has been added.");
		}
		else System.out.println("The cart is almost full.");
		// when add media List
		int numberDv = media.length, index = 0;
		if(numberDv == 0) {
			System.out.println("The List is empty.");
		}
		while(itemsInStore.size() < MAX_NUMBERS_ORDERED && index < numberDv) {
			itemsInStore.add(media[index]);
			System.out.println("The media " + media[index].getTitle() + " has been added.");
			++index;
		}
		if(itemsInStore.size() == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	public void removeMedia(Media media) {
		int xuathien = 0;
		for(int i = 0; i < itemsInStore.size(); ++i) {
			if(itemsInStore.get(i).equals(media)) {
				itemsInStore.remove(i);
				System.out.println("The media "+media.getTitle()+" has been removed.");
				xuathien = 1;
				break;
			}
		}
		if(xuathien == 0) System.out.println("The media hasn't been exsited in the List.");
	}
	// method to print the list of ordered items of a store
	public void print() {
		System.out.println("*********************************CART*********************************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < itemsInStore.size(); ++i) {
			System.out.println(i+1+". "+itemsInStore.get(i).toString());
			
		}
//		float totalcost = totalCost();
//		System.out.println("Total cost: " + "[" + totalcost + "]");
		System.out.println("************************************************************************");
	}	
}
