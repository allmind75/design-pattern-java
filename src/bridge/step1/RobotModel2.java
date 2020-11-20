package bridge.step1;

public class RobotModel2 implements IRobot {

	@Override
	public void powerOn() {
		System.out.println("type2 : power on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("type2 : power off");
	}
}
