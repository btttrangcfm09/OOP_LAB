package hust.soict.trang.test.media;

import hust.soict.trang.aims.media.DigitalVideoDisc;

class Wrapper {
    DigitalVideoDisc value;

    public Wrapper(DigitalVideoDisc value) {
        this.value = value;
    }
}
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		// Test for correct swap function
        Wrapper wrapper1 = new Wrapper(jungleDVD);
        Wrapper wrapper2 = new Wrapper(cinderellaDVD);
		swap(wrapper1, wrapper2);
		System.out.println("jungle dvd title: " + wrapper1.value.getTitle());
		System.out.println("cinderella dvd title: " + wrapper2.value.getTitle());
		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		
		
	}
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
	

    public static void swap(Wrapper w1, Wrapper w2) {
        DigitalVideoDisc temp = w1.value;
        w1.value = w2.value;
        w2.value = temp;
    }
}