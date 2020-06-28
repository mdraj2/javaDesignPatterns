package com.personal.command.part2;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		int numOfSlot = 7;
		onCommands = new Command[numOfSlot];
		offCommands = new Command[numOfSlot];

		Command noCommand = new NoCommand();
		for (int i = 0; i < numOfSlot; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n-----Remote Control-----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}

}
