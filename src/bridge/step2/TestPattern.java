package bridge.step2;

// 기능을 추가하기 위해 이미 구현된 모든 클래스를 수정했다.
public class TestPattern {

	public static void main(String[] args) {
		
		IRobot robot1 = new RobotModel1();
		robot1.powerOn();
		robot1.powerOff();
		robot1.doCook();
        
		System.out.println("--------------------");
		
		IRobot robot2 = new RobotModel2();
		robot2.powerOn();
		robot2.powerOff();
		robot2.doCook();
	}
}
