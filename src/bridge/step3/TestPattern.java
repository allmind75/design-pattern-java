package bridge.step3;

// 기능의 추가 : 행동(요리) 추가 
public class TestPattern {

	public static void main(String[] args) {
		IRobot robot = new RobotModel1();
        Cook work = new Cook(robot);
		work.powerOn();
		work.doCook();
		work.powerOff();

		System.out.println("--------------------");
		
		robot = new RobotModel2();
        work = new Cook(robot);
		work.powerOn();
		work.doCook();
		work.powerOff();
	}
}
