package imperative.lesson18;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 19.05.2020; Time: 09:27
 */
public class Round {
	public static double roundDigit(double digitNumber, int index) {
		int multiplucator = 10;
		int result = 1;
		for (int i = 1; i <= index; i++) {
			result = result * multiplucator;
		}

		int temp = (int) (digitNumber * result);
		double tempTwo = temp;

		return tempTwo / result;
	}

	public static double roundDigitOneLine(double dNumber, int index) {
		int multiplikator = 10;
		return (int) (dNumber * Math.pow(multiplikator, index)) / Math.pow(multiplikator, index);
	}
}
