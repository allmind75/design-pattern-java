package bridge.step4;

// 기능의 추가 : 행동 추가 
// 추가된 기능에 대한 구현의 추가 : 요리, 청소 등 추가
public class TestPattern {

	public static void main(String[] args) {
		IRobot robot1 = new RobotModel1();
		Cook work1 = new Cook(robot1);
		work1.powerOn();
		work1.doCook();
		work1.powerOff();

		System.out.println("--------------------");
		
		IRobot robot2 = new RobotModel1();
		Clean work2 = new Clean(robot2);
		work2.powerOn();
		work2.doClean();
		work2.powerOff();
	}

}
