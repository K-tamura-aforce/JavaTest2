package jp.co.aforce.test;

public class MinMax {

	// 最大値を返すメソッド
	int getMaxValue(int a, int b, int c) {
		int ans;

		ans = a;
		if (ans < b)
			ans = b;
		if (ans < c)
			ans = c;
		return ans;
	}

	// 最小値を返すメソッド
	int getMinValue(int a, int b, int c) {
		int ans;

		ans = a;
		if (ans > b)
			ans = b;
		if (ans > c)
			ans = c;
		return ans;

	}

}
