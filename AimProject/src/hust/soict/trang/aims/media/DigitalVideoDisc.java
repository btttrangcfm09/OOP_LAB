package hust.soict.trang.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	//Override contructor
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
	public DigitalVideoDisc(String title, String category, int length,float cost) {
		super(title,category,length,cost);
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		super(title);
		this.id = ++ nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category) {
		super(title,category);
		this.id = ++ nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, float cost) {
		super(title,cost);
		this.id = ++ nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title,String category,String director) {
		super(title,category,director);
		this.id = ++ nbDigitalVideoDiscs;
	}
	// variable
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
	
	// implement play()
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		if(this.getLength() == 0) {
			System.out.println("the DVD cannot be played.");
		}
	}
}