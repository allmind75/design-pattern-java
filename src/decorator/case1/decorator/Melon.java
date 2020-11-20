package decorator.case1.decorator;


import decorator.case1.base.IceCream;

public class Melon extends Decorator {

	private IceCream icecream;

	public Melon(IceCream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String getDescription() {
		return icecream.getDescription() + " + 멜론";
	}

	@Override
	public int price() {
		return 300 + icecream.price();
	}
}
