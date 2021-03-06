package liskov.substitution.principle.vehicles.impl;

import liskov.substitution.principle.vehicles.ElectricVehicle;
import liskov.substitution.principle.vehicles.Vehicle;

public class ElectricCar implements ElectricVehicle {

	@Override
	public void speed() {
		System.out.println("Speed up the car...");
	}

	@Override
	public void chargeBarttery() {
		System.out.println("Charging vehicle...");
	}

}
