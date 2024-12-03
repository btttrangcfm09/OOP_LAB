package hust.soict.trang.aims.media;

public class Disc extends Media{
	// Contructor
	public Disc(String title, String category, String director, float cost) {
		super(title,category,cost);
		this.director = director;
	}	
	public Disc(String title, String category, float cost) {
		super(title,category,cost);
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
	}
	public Disc(String title, String category, int length,float cost) {
		super(title,category,cost);
		this.length = length;
	}
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category) {
		super(title,category);
	}
	public Disc(String title, float cost) {
		super(title,cost);
	}
	public Disc(String title,String category,String director) {
		super(title,director);
		this.director = director;
	}
	// variable
	protected String director;
	protected int length;
	// getter
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
}
