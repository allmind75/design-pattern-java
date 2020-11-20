package Facade.case2;

public class TestPattern {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

		// 이전 사용 방식
        // 집에서 나갈 때 동작
        computer.turnOff();
        light.turnOff();
        radio.turnOff();
        
        // 파사드 패턴 적용 후 사용 방식
        // 집에 들어올 때 동작
        HomeFacade home = new HomeFacade(computer, light, radio);
        home.homeIn();
	}

}
