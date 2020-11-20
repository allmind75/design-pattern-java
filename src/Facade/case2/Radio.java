package Facade.case2;

public class Radio {
	private boolean turnedOn = false;

	public void turnOn() {
		turnedOn = true;
		System.out.println("Radio를 켬.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("Radio를 끔.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
