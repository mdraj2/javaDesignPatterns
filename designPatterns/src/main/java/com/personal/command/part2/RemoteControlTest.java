package com.personal.command.part2;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light sampleLight = new Light();
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();

		LightOnCommand turningOnLight = new LightOnCommand(sampleLight);
		LightOffCommand turningOffLight = new LightOffCommand(sampleLight);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, turningOnLight, turningOffLight);
		remoteControl.setCommand(1, stereoOnWithCD, stereoOff);
		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
	}

}
