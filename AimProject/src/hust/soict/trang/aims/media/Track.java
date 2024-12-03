package hust.soict.trang.aims.media;

public class Track implements Playable{
	// contructor
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public Track(String title) {
		super();
		this.title = title;
	}
	private String title;
	private int length;
	// getters
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	// implement play() method
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		if(this.getLength() == 0) {
			System.out.println("the track cannot be played.");
		}
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Track)) return false;
		Track track = (Track)o;
		if(track.getTitle() == this.getTitle() && track.getLength()==this.getLength()) return true;
		else return false;
	}
	
	
}
