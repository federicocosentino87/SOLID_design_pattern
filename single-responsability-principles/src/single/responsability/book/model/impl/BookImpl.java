package single.responsability.book.model.impl;

import single.responsability.book.model.Book;
import single.responsability.book.persistence.BookPersistence;

public class BookImpl implements Book{

	private BookPersistence bookPersistence;
	private int numOfPages;
	private String authorName;

	public BookImpl(int numOfPages, String authorName) {
		this.numOfPages = numOfPages;
		this.authorName = authorName;
		this.bookPersistence = new BookPersistence();
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/* Is important for one method to print or save
	 * never do it ad the same time, like printAndSave()
	 */

	@Override
	public void print() {
		System.out.println("Printing the book...");
	}

	@Override
	public void save() {
		bookPersistence.save(this);
	}

	@Override
	public String toString() {
		return authorName + " - " + numOfPages;
	}

}
