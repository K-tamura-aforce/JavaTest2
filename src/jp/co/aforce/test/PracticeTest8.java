package jp.co.aforce.test;

public class PracticeTest8 {

	public void printHello() {

		System.out.println("Hello");

	}

	public void printRandomMessage() {

		String[] str = { "こんばんは", "こんにちは", "おはよう" };
		//乱数をnumへ代入
		int num = (int) ((str.length) * Math.random());
		System.out.print(str[num]);

	}

	public void printMessage(String message) {

		System.out.println(message);

	}

	public void printMessage() {



	}

	private double printRectangleArea(double height, double width) {

		return height * width;
	}



}
