package hust.soict.trang.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media media1, Media media2) {
		// Compare the objects
		if(media1.getCost() > media2.getCost()) return -1;
		else if(media1.getCost() < media2.getCost()) return 1;
		else {
			String s1 = media1.getTitle(), s2 = media2.getTitle();
			if(s1.compareTo(s2) > 0) return -1;
			else if (s1.compareTo(s2)<0) return 1;
			else return 0;
			
		}
	}
}
