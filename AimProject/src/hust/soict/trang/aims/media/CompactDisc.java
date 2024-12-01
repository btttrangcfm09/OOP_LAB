package hust.soict.trang.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc{
	// constructors
	public CompactDisc(String title, String category, String artist, float cost) {
		super(title,category,cost);	
		this.artist = artist;
	}
	public CompactDisc(String title, String category, float cost) {
		super(title,category,cost);
	}
	
	public CompactDisc(String title, String category, String artist, int length, float cost) {
		super(title,category,length,cost);
		this.artist = artist;
	}
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc(String title, String category, String director, String artist,float cost ) {
		super(title,category,director,cost);	
		this.artist = artist;
	}
	
	public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
		super(title,category,director,length,cost);
		this.artist = artist;
	}
	
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
}
