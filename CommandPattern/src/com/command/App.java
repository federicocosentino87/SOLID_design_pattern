package com.command;

// The object invoking the computation knows nothing about the implementation

public class App {

	public static void main(String[] args) {
		Switcher switcher = new Switcher();
		
		Light light = new Light();
		
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		
		switcher.addCommand(turnOnCommand);
		switcher.addCommand(turnOffCommand);
		
		switcher.executeCommands();
	}
	
}
