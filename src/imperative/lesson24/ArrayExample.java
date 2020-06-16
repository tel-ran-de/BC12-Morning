package imperative.lesson24;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 27.05.2020; Time: 11:29
 */
public class ArrayExample {
	public static void main(String[] args) {
		arrayTryAndCry((int) (Math.random() * 100));
	}

	private static void arrayTryAndCry(int countDigits) {
		int[] myArray = new int[countDigits];
		for (int element : myArray) {
			element = (int) (Math.random() * 100);
			System.out.print(element + " ,");
		}
	}
}
