package bridge.step4;

public class Cook extends IAction {

	public Cook(IRobot robot) {
		super(robot);
	}

	// 행동(요리) 추가 
	public void doCook() {
		System.out.println("요리를 합니다.");
	}
}

//public class Cook implements IWork {
//
//	@Override
//	public void doWork() {
//		System.out.println("요리를 합니다.");
//	}
//}
