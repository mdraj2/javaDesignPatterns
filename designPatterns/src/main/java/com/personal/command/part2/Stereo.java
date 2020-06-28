package com.personal.command.part2;

public class Stereo {
	public void on() {
		System.out.println("stero is now on");
	}

	public void off() {
		System.out.println("stero is now off");
	}

	public void setCd() {
		System.out.println("cd has been set");
	}

	public void setDvd() {
		System.out.println("dvd has been set");
	}

	public void setRadio() {
		System.out.println("radio has been set");
	}

	public void setVolume(int volumeLevel) {
		System.out.println("volume has been set to" + volumeLevel);
	}
}
