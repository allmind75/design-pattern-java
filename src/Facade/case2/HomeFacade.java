package Facade.case2;

public class HomeFacade {
	private Computer computer;
	private Light light;
	private Radio radio;

	public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

	public void homeIn() {
		System.out.println("집에 오면 Computer 켜고, Radio 켜고, Light 켜기.");
		if (!computer.isTurnedOn()) {
			computer.turnOn();
		}
		if (!light.isTurnedOn()) {
			light.turnOn();
		}
		if (!radio.isTurnedOn()) {
			radio.turnOn();
		}
	}

	public void homeOut() {
		System.out.println("Computer 끄고, Radio 끄고, Light 끄고 외출하기.");
		if (computer.isTurnedOn()) {
			computer.turnOff();
		}
		if (light.isTurnedOn()) {
			light.turnOff();
		}
		if (radio.isTurnedOn()) {
			radio.turnOff();
		}
	}
}
