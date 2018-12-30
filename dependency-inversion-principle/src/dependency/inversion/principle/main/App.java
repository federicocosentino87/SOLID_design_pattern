package dependency.inversion.principle.main;

public class App {

	/*
	 * D - Dependency Inversion Principle
	 *
	 *
	 * developing a software we first develop the low level modules --> db connection, XML Parser, disk access etc..
	 * then the high level --> that rely on the low level one
	 *
	 *
	 *this is not good especially if we want to change low level module
	 *
	 * So high level should not depends on high level modules
	 *
	 * -------------------------------------------------------
	 *
	 * difficult to apply, but is an important principle
	 *
	 * both high and low level should depends on abstraction
	 * ---------------------------------------------------
	 *
	 *
	 * inversion of control can be implemented with design patterns
	 *
	 * Factory - Template - Strategy Pattern
	 * Service Locator Pattern
	 * Dependency injection
	 *
	 */

	public static void main (String[] args) {
		DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase());
		databaseHandler.connect();
		databaseHandler.disconnect();
	}
}
