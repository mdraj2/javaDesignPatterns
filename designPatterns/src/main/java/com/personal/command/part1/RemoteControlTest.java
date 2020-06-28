package com.personal.command.part1;

public class RemoteControlTest {
	public static void main(String[] args) {
		// this is the invoker
		SimpleRemoteControl remote = new SimpleRemoteControl();
		// this is the reciever of the command
		Light light = new Light();
		// this is the reciever of the command
		GarageDoor garageDoor = new GarageDoor();
		// this is the command for turning on the light of that given object
		LightOnCommand lightOn = new LightOnCommand(light);
		// this is the command for openign the door of that specific garage door
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		// this is the invoker invoking the method
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
