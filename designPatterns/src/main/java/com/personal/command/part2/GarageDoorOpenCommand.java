package com.personal.command.part2;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garage;

	public GarageDoorOpenCommand(GarageDoor garage) {
		this.garage = garage;
	}

	// this needs to take in a garageDoor
	@Override
	public void execute() {
		garage.up();
	}

}
