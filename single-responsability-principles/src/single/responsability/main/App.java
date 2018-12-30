package single.responsability.main;

import single.responsability.book.model.Book;
import single.responsability.book.model.impl.BookImpl;

public class App {

	/*
	 * S - Single Responsibility Principle
	* A class or method should have only one reason to change
	* If a class or method does one or more prodecudere is better to split them
	*/

	public static void main(String[] args) {
		Book book1 = new BookImpl(1020, "Albert Camus");
		book1.save();
	}
}