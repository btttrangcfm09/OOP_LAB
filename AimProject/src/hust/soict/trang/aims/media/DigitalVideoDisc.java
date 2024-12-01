package hust.soict.trang.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	//Override
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,director,cost);
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
		this.id = ++nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		super(title);
		this.id = ++ nbDigitalVideoDiscs;
	}
	
	private static int nbDigitalVideoDiscs = 0;	
	
	// getter
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}	
	@Override
	public String toString() {
		return "DVD - [" + title + "] - [" + category + "] - [" + director + "] - ["
				+ length + "]: [" + cost + "]$";
	}
	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}
	public boolean isMatch(String t) {
		for(int i = 0; i < t.length(); ++i) {
			char c = t.charAt(i);
			char c1 = Character.toLowerCase(c);
			char c2 = Character.toUpperCase(c);
			if(title.indexOf(c1)!=-1 || title.indexOf(c2) != -1) {
				return true;
			}
		}
		return false;
	}
	
	// implement play()
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}