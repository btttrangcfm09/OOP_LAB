package hust.soict.trang.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.trang.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemOrdered = new ArrayList<Media>();
	public void addMedia(Media media) {
		if(itemOrdered.contains(media)) {
			System.out.println("The " + media.getTitle()+" was added in the cart. Can not added!");
			return;
		}
		if(itemOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemOrdered.add(media);
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
		while(itemOrdered.size() < MAX_NUMBERS_ORDERED && index < numberDv) {
			if(itemOrdered.contains(mediaList[index])) {
				System.out.println("The "+mediaList[index].getTitle()+" was added in the cart. Can not added!");
				
			}
			else {
				itemOrdered.add(mediaList[index]);
				System.out.println("The media " + mediaList[index].getTitle() + " has been added.");
			}
			++index;
		}
		if(itemOrdered.size() == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	// 2.1 overloading for parameter is arbitrary number
	public void addMedia(Media media1,Media ...media) {
		// when add media1
		if(itemOrdered.contains(media1)) {
			System.out.println("The "+media1.getTitle()+" was added in the cart. Can not added!");
			
		}
		else if(itemOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemOrdered.add(media1);
		    System.out.println("The media " + media1.getTitle() + " has been added.");

		}
		else System.out.println("The cart is almost full.");
		
		// when add media List
		int numberDv = media.length, index = 0;
		if(numberDv == 0) {
			System.out.println("The List is empty.");
		}
		while(itemOrdered.size() < MAX_NUMBERS_ORDERED && index < numberDv) {
			if(itemOrdered.contains(media[index])) {
				System.out.println("The "+media[index].getTitle()+" was added in the cart. Can not added!");
				
			}
			else {
				itemOrdered.add(media[index]);
				System.out.println("The media " + media[index].getTitle() + " has been added.");
			}
			++index;
		}
		if(itemOrdered.size() == MAX_NUMBERS_ORDERED && index < numberDv) {
			System.out.println("The cart is almost full.");
		}
	}
	//2.2 Overloading by differing the number of parameters
	public void addMedia(Media media1,Media media2) {
		// media1
		if(itemOrdered.contains(media1)) {
			System.out.println("The "+media1.getTitle()+" was added in the cart. Can not added!");
			
		}
		else if(itemOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemOrdered.add(media1);
			System.out.println("The media " + media1.getTitle() + " has been added.");
		}
		else System.out.println("The cart is almost full.");
		// media2
		if(itemOrdered.contains(media2)) {
			System.out.println("The "+media2.getTitle()+" was added in the cart. Can not added!");
			
		}
		else if(itemOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemOrdered.add(media2);
		}
		else System.out.println("The cart is almost full.");
	}
	public void removeMedia(Media media) {
		int xuathien = 0;
		for(int i = 0; i < itemOrdered.size(); ++i) {
			if(itemOrdered.get(i).equals(media)) {
				itemOrdered.remove(i);
				System.out.println("The media "+media.getTitle()+" has been removed.");
				xuathien = 1;
				break;
			}
		}
		if(xuathien == 0) System.out.println("The media hasn't been exsited in the List.");
	}
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < itemOrdered.size(); ++i) {
			total += itemOrdered.get(i).getCost();
		}
		return total;
	}
	
	// method to print the list of ordered items of a cart
	public void print() {
		System.out.println("*********************************CART*********************************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < itemOrdered.size(); ++i) {
			System.out.println(i+1+". "+itemOrdered.get(i).toString());
			
		}
		float totalcost = totalCost();
		System.out.println("Total cost: " + "[" + totalcost + "]");
		System.out.println("************************************************************************");
	}
	public void numberOfMedia() {
		System.out.println(itemOrdered.size());
	}
	
	// search item by id
	public void searchById(int ID) {
		boolean check = false;
		for(int i = 0; i < itemOrdered.size(); ++i) {
			if(ID == itemOrdered.get(i).getId()) {
				check = true;
				System.out.println(ID + " " + itemOrdered.get(i).toString());
			}
		}
		if(check == false) {
			System.out.println("Not found!");
		}
	}
	// search item by title
	public void searchByTitle(String title) {
		boolean check = false;
		for(int i = 0; i < itemOrdered.size(); ++i) {
			if(itemOrdered.get(i).isMatch(title)) {
				check = true;
				System.out.println(itemOrdered.get(i).getId() + " " + itemOrdered.get(i).toString());
			}
		}
		if(check == false) System.out.println("Not found!");
	}
	// Sort by CostTiltle
	public void sortByCostTitle(){
		Collections.sort(itemOrdered,Media.COMPARE_BY_COST_TITLE);
		for(Media media : itemOrdered) {
			System.out.println(media.toString());
		}
	}
	// Sort by TitleCost
	public void sortByTitleCost(){
		Collections.sort(itemOrdered,Media.COMPARE_BY_TITLE_COST);
		for(Media media : itemOrdered) {
			System.out.println(media.toString());
		}
	}
}