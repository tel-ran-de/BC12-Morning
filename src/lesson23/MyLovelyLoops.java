package lesson23;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 26.05.2020; Time: 11:18
 */
public class MyLovelyLoops {
	public static void main(String[] args) {
		fibonacci(10);
	}

	private static void fibonacci(int lastLine) {
		// 0,1,1,2,3,5,8,13,21,34
		int n0 = 0;
		//System.out.println(n0);
		int n1 = 1;
		System.out.println(n1);
		for (int i = 1; i <= lastLine; i++) {
			int myFibonacciDigitNow = n0 + n1;
			System.out.println(myFibonacciDigitNow);
			n0 = n1;
			n1 = myFibonacciDigitNow;
		}
	}
}
