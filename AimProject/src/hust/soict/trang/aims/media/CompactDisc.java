package hust.soict.trang.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	// constructors
	public CompactDisc(String title, String category, String director, float cost) {
		super(title,category,director,cost);
		this.id = ++nbCompactDisc;
	}
	public CompactDisc(String title, String category, float cost) {
		super(title,category,cost);
		this.id = ++nbCompactDisc;
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);
		this.id = ++nbCompactDisc;
	}
	public CompactDisc(String title, String category, int length,float cost) {
		super(title,category,length,cost);
		this.id = ++nbCompactDisc;
	}
	public CompactDisc(String title) {
		super(title);
		this.id = ++ nbCompactDisc;
	}
	public CompactDisc(String title, String category) {
		super(title,category);
		this.id = ++ nbCompactDisc;
	}
	public CompactDisc(String title, float cost) {
		super(title,cost);
		this.id = ++ nbCompactDisc;
	}
	public CompactDisc(String title,String category,String director) {
		super(title,category,director);
		this.id = ++ nbCompactDisc;
	}
	public CompactDisc(String title,String category,String director,String artist) {
		super(title,category,director);
		this.artist = artist;
		this.id = ++ nbCompactDisc;
	}
	public CompactDisc(String title, String category, String director, String artist,int length, float cost) {
		super(title,category,director,length,cost);
		this.artist = artist;
		this.id = ++nbCompactDisc;
	}
	public CompactDisc(String title, String category, float cost, String artist) {
		super(title,category,cost);
		this.artist = artist;
		this.id = ++nbCompactDisc;
	}
	private static int nbCompactDisc = 0;
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	// getter
	public String getArtist() {
		return artist;
	} 
	
	// addTrack
	public void addTrack(Track track) {
		for(int i = 0; i < tracks.size(); ++i) {
			if(track.equals(tracks.get(i))) {
				System.out.println("This "+track + " has been exsited!");
				return;
			}
		}
		tracks.add(track);
		System.out.println("This "+track + " has been added!");
	}
	// removeTrack
	public void removeTrack(Track track) {
		for(int i = 0; i < tracks.size(); ++i) {
			if(track.equals(tracks.get(i))) {
				tracks.remove(i);
				System.out.println("This "+track + " has been removed!");
			}
		}
		System.out.println("This "+track + " has not been added!");
	}
	// getLength
	public int getLength() {
		int totalLength = 0;
		for(Track track:tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	// implement play() method
	public void play(CompactDisc CD) {
		System.out.println("Playing CompactDisc: " + CD.getTitle());
		System.out.println("CompactDisc length: " + CD.getLength());
		if(CD.getLength() == 0) {
			System.out.println("The CD of that track cannot be played.");
		}
	}
	public void play() {
		for(Track track:tracks) {
			track.play();
		}
	}
}
