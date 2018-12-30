package open.closed.principles.main;

import open.closed.principles.api.manager.SorterManager;
import open.closed.principles.impl.MergeSort;

public class App {

	/*
	 * OPEN/CLOSED PRINCIPLES
	 *
	 * Changing in existing code should be minimized, modify less possible
	 *
	 * software entities should be open for extension, but close for modification
	 *
	 * class should not extend another class explitcitly, should have a common interface
	 *
	 * for SOLID design can be used:
	 *
	 * 1) Strategy Pattern
	 * 2) Template Pattern
	 *
	 */

	public static void main(String[] args) {

		SorterManager sorterManager = new SorterManager();
		sorterManager.sort(new MergeSort());

	}
}
