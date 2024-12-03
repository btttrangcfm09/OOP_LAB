package hust.soict.trang.test.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.trang.aims.media.DigitalVideoDisc;
import hust.soict.trang.aims.media.Media;

public class TestMedia {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Table", "Animation", "Roger Allers", 110, 40.95f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Table 2", "Animation", "Roger Allers", 100, 40.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Luscas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 120, 18.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King 3", "Animation", "Roger Allers", 100, 30.95f);

        mediae.add(dvd1);
        mediae.add(dvd2);
        mediae.add(dvd3);
        mediae.add(dvd4);
        mediae.add(dvd5);
        mediae.add(dvd6);
	}

}
