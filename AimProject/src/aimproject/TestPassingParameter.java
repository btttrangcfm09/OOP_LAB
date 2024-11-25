package aimproject;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrong swap
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		// Correct Swap
		// Test for swap function
		DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};
		swap(dvds);

		System.out.println("jungle dvd title: " + dvds[0].getTitle());
		System.out.println("cinderella dvd title: " + dvds[1].getTitle());	
		
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
			
	}
	// Wrong swap
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	// Correct swap
    public static void swap(DigitalVideoDisc [] dvds) {
        DigitalVideoDisc temp = dvds[0];
        dvds[0] = dvds[1];
        dvds[1] = temp;
    }
}
