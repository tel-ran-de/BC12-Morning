package lesson19;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 19.05.2020; Time: 11:52
 */
public class MagicSchoolMath {
	public static void main(String[] args) {
		//System.out.println(largestCommonDenominator(5, 7));
		System.out.println(leastCommonMultiple(15, 20));
	}

	public static int leastCommonMultiple(int a, int b) {
		return a * b / largestCommonDenominator(a, b);

	}

	public static int largestCommonDenominator(int a, int b) {
		int result = 0;
		int minNumber;
		if (a < b) {
			minNumber = a;
		} else {
			minNumber = b;
		}
		for (int i = 1; i < minNumber; i++) {
			if (a % i == 0 & b % i == 0) {
				result = i;
			}
		}
		return result;
	}

}
