package dependency.inversion.principle.main;

public class OracleDatatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle database.....");
	}

	@Override
	public void discconnect() {
		System.out.println("Disconnecting to Oracle database.....");
	}
}
