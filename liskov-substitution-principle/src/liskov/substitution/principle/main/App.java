package liskov.substitution.principle.main;

import liskov.substitution.principle.vehicles.ElectricVehicle;
import liskov.substitution.principle.vehicles.Vehicle;
import liskov.substitution.principle.vehicles.impl.ElectricCar;

public class App {

	/*
	 * L - Liskov Substitution Principle
	 *
	 *
	 * child classes should never break the parent class type definition
	 *
	 * subtypes must be substitutable for their base type
	 *
	 * it is not independent from Open Close Principle + interface segregation Principle
	 * interface segregation Principle --> break of interfaces into smaller interfaces
	 *
	 */

	public static void main(String[] args) {


		// ElectricVehicle is substituible with ElectricCar, so the principle is not broken
		//We can use both child or parent type
		ElectricVehicle car = new ElectricCar();

		car.chargeBarttery();

	}

}
