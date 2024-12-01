package hust.soict.trang.aims.media;
import java.util.ArrayList;
public class Book extends Media{
	
	private ArrayList<String> authors = new ArrayList<String>();
	public ArrayList<String> getAuthors() {
		return authors;
	}
	// add new authors
	public void addAuthor(String authorName) {
		for(int i = 0; i < authors.size(); ++i) {
			if(authorName.equals(authors.get(i))) {
				System.out.println("This "+authorName + " has been exsited!");
				return;
			}
		}
		authors.add(authorName);
		System.out.println("This "+authorName + " has been added!");
	}
	
	// remove author
	public void removeAuthor(String authorName) {
		for(int i = 0; i < authors.size(); ++i) {
			if(authorName.equals(authors.get(i))) {
				authors.remove(i);
				System.out.println("This "+authorName + " has been removed!");
			}
		}
		System.out.println("This "+authorName + " has not been exsited!");
	}
}
