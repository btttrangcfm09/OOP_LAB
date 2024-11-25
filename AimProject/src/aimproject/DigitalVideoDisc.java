package aimproject;

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
		return "DigitalVideoDisc [title=" + title + ", category=" + category + ", director=" + director + ", length="
				+ length + ", cost=" + cost + "]";
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
	
}