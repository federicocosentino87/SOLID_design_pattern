package dependency.inversion.principle.main;

public class DatabaseHandler {

	//DatabaseHandler know nothing about implementation, this is flexible
	private Database database;

	public DatabaseHandler(Database database) {
		this.database = database;
	}

	public void connect() {
		database.connect();
	}

	public void disconnect() {
		database.discconnect();
	}
}
