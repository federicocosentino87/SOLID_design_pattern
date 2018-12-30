package dependency.inversion.principle.main;

public class MySQLDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Connecting to MySQL database.....");
	}

	@Override
	public void discconnect() {
		System.out.println("Disconnecting to MySQL database.....");
	}
}
