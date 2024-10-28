import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public int Count_Number;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

	void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (Count_Number == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered.add(dvd);
			Count_Number++;
			System.out.println("The disc has been added!");
		}
	}	
	void removeDigitalVideoDisc(int arg) {
		itemsOrdered.remove(arg);
		Count_Number--;
	}
	float totalCost() {
		float total = 0;
		for (DigitalVideoDisc a : itemsOrdered) {
			total += a.getCost();
		}
		return total;
	}
	void seeInfo(int index) {
		DigitalVideoDisc a = itemsOrdered.get(index);
		System.out.println("DVD so: " + index);
		System.out.println("Title: " + a.getTitle());
		System.out.println("Category: " + a.getCategory());
		System.out.println("Diretor: " + a.getDirector());
		System.out.println("Length: " + a.getLength());
		System.out.println("Cost: " + a.getCost());
		System.out.println("-----------------------------");
	}
}
