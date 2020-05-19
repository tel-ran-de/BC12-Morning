package lesson18;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 19.05.2020; Time: 09:27
 */
public class Round {
	public static double roundDigit(double digitNumber, int index) {
		int multiplucator = 10;
		for (int i = 0; i < index; i++) {
			multiplucator *= index;
		}
		System.out.println("Multiplicator " + multiplucator);

		int temp = (int) (digitNumber * multiplucator);
		System.out.println(temp);
		double tempTwo = temp;

		return tempTwo / multiplucator;
	}
}
