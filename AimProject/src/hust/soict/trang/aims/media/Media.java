package hust.soict.trang.aims.media;

public abstract class Media {
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public Media(String title, float cost) {
		super();
		this.title = title;
		this.cost = cost;
	}
	public Media(String title) {
		super();
		this.title = title;
	}
	int id;
	String title;
	String category;
	float cost;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
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
