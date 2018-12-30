package liskov.substitution.principle.vehicles.impl;

import liskov.substitution.principle.vehicles.Vehicle;

public class Car implements Vehicle {

	@Override
	public void speed() {
		System.out.println("Speed up the car...");
	}

	@Override
	public void addFuel() {
		System.out.println("Adding some fuel...");
	}

}
