package lab1;

public class Cart {

    public Cart() {
        super();
    }

    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("The disc " + dvd.getTitle() + " has been added.");
        } else {
            System.out.println("The cart is full, cannot add more items.");
        }
    }

    // Calculate total cost of DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
