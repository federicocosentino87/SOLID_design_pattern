package com.strategy;

//Separate behavior from implementation

//We are to change behavior at runtime

public class App {
	
	public static void  main (String[] args) {
		
		Manager manager = new Manager();
		
		manager.setStrategy(new Add());
		
		manager.operation(3, 1);
		
		manager.setStrategy(new Multuply());
		
		manager.operation(3, 1);	
	}

}
