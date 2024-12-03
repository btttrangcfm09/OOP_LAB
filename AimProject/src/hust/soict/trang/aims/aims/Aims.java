package hust.soict.trang.aims.aims;

import java.util.*;
import hust.soict.trang.aims.cart.Cart;
import hust.soict.trang.aims.store.Store;
import hust.soict.trang.aims.media.*;

public class Aims {
    static Store store = new Store();
    static Cart cart = new Cart();
    public static void initial() {
    	store.addMedia(new DigitalVideoDisc("The Tiger", "Animation", "abc", 100, 20.99f));
        store.addMedia(new DigitalVideoDisc("Apple 1", "Animation", "xyz", 200, 40.99f));
        store.addMedia(new DigitalVideoDisc("Apple 2", "Animation", "xyz", 300, 50.99f));
        store.addMedia(new DigitalVideoDisc("Apple 3", "Animation", "xyz", 400, 60.99f));
        store.addMedia(new DigitalVideoDisc("Apple 4", "Animation", "xyz", 500, 70.99f));
        store.addMedia(new DigitalVideoDisc("Apple 5", "Animation", "xyz", 600, 80.99f));
        
    }
    public static void main(String[] args) {
        initial();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                	
                    viewStore(scanner);
                    break;
                case 2:
                    
                    updateStore(scanner);
                    break;
                case 3:
                    cartMenu(scanner);
                    break;
                case 0:
                    System.out.println("End program!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void viewStore(Scanner scanner) {
        while (true) {
        	storeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    seeMediaDetails(scanner);
                    break;
                case 2:
                    addMediaToCart(scanner);
                    break;
                case 3:
                    playMedia(scanner);
                    break;
                case 4:
                	cartMenu(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void seeMediaDetails(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            System.out.println(media.toString());
            
            mediaDetails(scanner, media);
        } else {
            System.out.println("Not found.");
        }
    }
    public static void mediaDetailsMenu() {
    	System.out.println("Options: ");
    	System.out.println("--------------------------------");
    	System.out.println("1. Add to cart");
    	System.out.println("2. Play");
    	System.out.println("0. Back");
    	System.out.println("--------------------------------");
    	System.out.println("Please choose a number: 0-1-2");
    }

    public static void mediaDetails(Scanner scanner, Media media) {
        while (true) {
        	mediaDetailsMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media cannot be played.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void addMediaToCart(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Current number of DVDs: " + cart.getNumberItemsOrdered());
        } else {
            System.out.println("Not found");
        }
    }

    public static void playMedia(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Not found");
        }
    }
    public static void updateStoreMenu() {
    	System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2: ");
    }
    public static void updateStore(Scanner scanner) {
        while (true) {
        	updateStoreMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addMediaToStore(scanner);
                    break;
                case 2:
                    removeMediaFromStore(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void addMediaToStore(Scanner scanner) {
    	System.out.println("Enter the type of Media:");
    	System.out.println("1. Book.");
    	System.out.println("2. Digital Video Disc.");
    	System.out.println("3. Compact Disc.");
    	System.out.println("0. Back.");
    	int type = scanner.nextInt();
    	if(type == 0) return;
    	scanner.nextLine();
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        System.out.println("Enter the category: ");
        String category = scanner.nextLine();
        System.out.println("Enter the cost: ");
        float cost = scanner.nextFloat();
        switch(type) {
            case 1:
            	Media mb = new Book(title, category, cost);
            	store.addMedia(mb);
            	break;
            case 2: 
            	Media mdvd = new DigitalVideoDisc(title, category, cost);
            	store.addMedia(mdvd);
            	break;
            case 3:
            	Media mcd = new CompactDisc(title, category, cost);
            	store.addMedia(mcd);
            	break;
            default:
            	System.out.println("Invalid choice, please try again.");
        }
    }

    public static void removeMediaFromStore(Scanner scanner) {
        System.out.println("Enter the title of the media to remove: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            store.removeMedia(media);
        } else {
            System.out.println("Not found");
        }
    }
    public static void cartMenu() {
    	System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5: ");
    }
    public static void cartMenu(Scanner scanner) {
        while (true) {
            cartMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    filterMediasInCart(scanner);
                    break;
                case 2:
                    sortMediasInCart(scanner);
                    break;
                case 3:
                    removeMediaFromCart(scanner);
                    break;
                case 4:
                    playMedia(scanner);
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void filterMediasInCart(Scanner scanner) {
        System.out.println("Filter by: ");
        System.out.println("1. ID");
        System.out.println("2. Title");
        System.out.println("0. Back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            	System.out.println("Please enter ID");
            	int id = scanner.nextInt();
            	cart.searchById(id);
                break;
            case 2:
            	scanner.nextLine();
            	String title = scanner.nextLine();
            	cart.searchByTitle(title);
                break;
            case 0: return;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void sortMediasInCart(Scanner scanner) {
        System.out.println("Sort by: ");
        System.out.println("1. Title");
        System.out.println("2. Cost");
        System.out.println("0. Back");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                cart.sortByTitleCost();
                break;
            case 2:
                cart.sortByCostTitle();
                break;
            case 0: return;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void removeMediaFromCart(Scanner scanner) {
        System.out.println("Enter the title of the media to remove: ");
        String title = scanner.nextLine();
        Media media = cart.search(title);
        cart.removeMedia(null);
    }

    public static void placeOrder() {
        System.out.println("That an order is created and empty the current cart.");
        cart.clear();
    }
}
