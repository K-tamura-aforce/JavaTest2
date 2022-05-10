package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;

		System.out.println(x * y);
		System.out.println(y / x);
		System.out.println(y % x);

		double a = y * z;

		System.out.println(a);

		System.out.println(++a);

		int age = 23;

		Random rnd = new Random();

		int randomNumber = rnd.nextInt(100) + 1;
		System.out.print(randomNumber + " ");

		if (age > randomNumber) {

			System.out.println("私の方が年上です");

		} else if (age < randomNumber) {

			System.out.println("私の方が年下です");

		} else if (age == randomNumber) {

			System.out.println("私と同い年です");

		}
	}
}
