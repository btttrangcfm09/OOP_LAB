package hust.soict.trang.aims.media;

public class Disc extends Media{
	public Disc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}	
	public Disc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		
		this.cost = cost;
	}
	public Disc(String title, String category, int length,float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.length = length;
	}
	public Disc(String title) {
		super();
		this.title = title;
	}
	protected String director;
	protected int length;
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	
	
}
