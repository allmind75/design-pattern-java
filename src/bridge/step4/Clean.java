package bridge.step4;

public class Clean extends IAction {

	public Clean(IRobot robot) {
		super(robot);
	}

	// 행동(청소) 추가 
	public void doClean() {
		System.out.println("청소를 합니다.");
	}
}
