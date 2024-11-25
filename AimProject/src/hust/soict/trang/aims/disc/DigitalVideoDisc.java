package hust.soict.trang.aims.disc;

public class DigitalVideoDisc {
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++ nbDigitalVideoDiscs;
	}
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;	
	private int id;
	// getter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
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
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
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
}