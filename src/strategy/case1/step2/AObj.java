package strategy.case1.step2;

public class AObj {

	BInterface binterface;

	public AObj() {
		binterface = new BImplement();
	}

	public void SomeFunc() {
		// 다음 기능을 수행합니다.
		//System.out.println("AAA");
		//System.out.println("AAA");
		
		// 위의 기능이 필요합니다. B님 만들어 주세요.
		// 기능 구현을 위임. Delegate
		binterface.funcA();
		binterface.funcA();
	}
}
