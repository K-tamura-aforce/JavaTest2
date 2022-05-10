package jp.co.aforce.test;

public class PracticeTest1 {

	public static void main(String[] args) {

		double TAX = 0.1;

		System.out.println(TAX);

		int x = 480;

		double price = x * TAX;

		System.out.println("この商品の値段は" + (x + price) + "円です");

		String name = "田村 叶子";

		System.out.println(name);

		//アクセス制御とはクラスやその中で定義されるフィールドやメソッドなどが、ほかの場所から見える「範囲」を制御するための仕組み。

		//private

	}

}
