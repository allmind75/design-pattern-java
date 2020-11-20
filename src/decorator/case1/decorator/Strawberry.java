package decorator.case1.decorator;


import decorator.case1.base.IceCream;

// Strawberry는 Decorator이기 때문에 Decorator를 상속한다.
public class Strawberry extends Decorator {

	// Wrapping 하고자 하는 음료를 저장하기 위한 Instance 변수
	IceCream icecream;

	public Strawberry(IceCream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String getDescription() {
		return icecream.getDescription() + " + 딸기";
	}

	@Override
	public int price() {
		return 500 + icecream.price();
	}
}
