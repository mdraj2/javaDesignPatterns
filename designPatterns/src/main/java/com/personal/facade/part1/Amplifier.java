package com.personal.facade.part1;

public class Amplifier {

	public void on() {
		System.out.println("The amp has been turned on");

	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("The dvd has been set in the player");

	}

	public void setSurroundSound() {
		System.out.println("Set surround sound has been turned on");

	}

	public void setVolume(int i) {
		System.out.println("The volume has been set to" + i);

	}

}
