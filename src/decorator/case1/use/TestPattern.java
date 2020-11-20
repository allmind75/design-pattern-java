package decorator.case1.use;

import decorator.case1.base.IceCream;
import decorator.case1.base.IceCreamCake;
import decorator.case1.base.IceCreamCone;
import decorator.case1.base.IcePop;
import decorator.case1.decorator.Melon;
import decorator.case1.decorator.Strawberry;

public class TestPattern {

	public static void main(String[] args) {

		IceCream icecream1 = new IceCreamCone();
		System.out.println(icecream1.getDescription() + " cost : " + icecream1.price());

		// 아래와 같은 식으로 기본에 첨가물들을 Wrapping해서 가격과 설명을 추가할 수 있다.
		IceCream icecream2 = new IceCreamCake();
		icecream2 = new Strawberry(icecream2);
		System.out.println(icecream2.getDescription() + " cost : " + icecream2.price());

		IceCream icecream3 = new Melon(new Strawberry(new IcePop()));
		System.out.println(icecream3.getDescription() + " cost : " + icecream3.price());
	}
}
