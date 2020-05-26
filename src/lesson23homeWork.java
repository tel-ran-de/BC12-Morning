/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 26.05.2020; Time: 09:37
 */
public class lesson23homeWork {
	public static void main(String[] args) {
		System.out.println(checkPalindrome("Andrej"));
		System.out.println(checkPalindrome("поп"));
		System.out.println(checkPalindrome("А роза упала на лапу Азора"));
	}

	private static boolean checkPalindrome(String myPalindrome) {
		myPalindrome = myPalindrome.toLowerCase().replace(" ", "");
		boolean result = false;
		String reversePalindrome = "";
		
		for (int i = 0; i < myPalindrome.length(); i++) {
			reversePalindrome = myPalindrome.charAt(i) + reversePalindrome;
		}
		if (myPalindrome.equals(reversePalindrome)) {
			return true;
		}
		return result;
	}
}
