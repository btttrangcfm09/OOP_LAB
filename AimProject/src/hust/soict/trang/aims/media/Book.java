package hust.soict.trang.aims.media;
import java.util.ArrayList;
public class Book extends Media{
	// contructor
	public Book(String title, String category, float cost) {
		super(title,category,cost);
		this.id = ++nbBook;
	}
	public Book(String title, String category) {
		super(title,category);
		this.id = ++nbBook;
	}
	public Book(String title, float cost) {
		super(title,cost);	
		this.id = ++nbBook;
	}
	public Book(String title) {
		super(title);
		this.id = ++nbBook;
	}
	public Book(String title, String category, String author, float cost) {
		super(title,category,cost);
		this.author = author;
		this.id = ++nbBook;
	}
	public Book(String title,String category,String author) {
		super(title,category);
		this.author = author;
		this.id = ++nbBook;
	}
	// variable
	private static int nbBook = 0;
	private ArrayList<String> authors = new ArrayList<String>();
	private String author;
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