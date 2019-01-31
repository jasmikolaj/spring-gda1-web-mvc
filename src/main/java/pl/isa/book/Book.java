package pl.isa.book;

public class Book {

	private String title;
	private final Author author;
	private final Double price;

	public Book(String title, Author author, Double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public Double getPrice() {
		return price;
	}
}
