package bridge.step4;

// IRobot, RobotModel1, RobotModel2 의 변경 없이 기능을 추가하려고 한다.
public class IAction {
	private IRobot robot;

	public IAction(IRobot robot) {
		this.robot = robot;
	}

	// IRobot의 기능을 전부 똑같이 구현한다.
	void powerOn() {
		robot.powerOn();
	}

	void powerOff() {
		robot.powerOff();
	}
}

//public interface IWork {
//void doWork();
//}

