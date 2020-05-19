package lesson19;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 19.05.2020; Time: 09:57
 */
public class MyString {
	public static void main(String[] args) {
		System.out.println(missingChar("Andrej", 15));
	}

	// 19_01
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	//19_02
	public static int diff21(int n) {
		int magicNumber = 21;
		int result = 0;
		if (n > magicNumber) {
			result = 2 * Math.abs(n - magicNumber);
		} else {
			result = Math.abs(n - magicNumber);
		}
		return result;
	}

	//19_03
	public static boolean nearHundred(int a) {
		int range = 10;
		int pylonOne = 100;
		int pylonTwo = 200;
		return a >= pylonOne - range && a <= pylonOne + range || a >= pylonTwo - range && a <= pylonTwo + range;
	}

	//19_04
	public static String missingChar(String str, int index) {
		String result = "";

		if (index >= str.length()) {
			result = "Ssssssoooorrrryyy, not possible";
		} else {
			result = str.substring(0, index) + str.substring(index + 1, str.length());
		}
		return result;
	}

	//19_00
	public static boolean checkMatchString(String a, String b) {
		return a.equals(b);
	}
}
