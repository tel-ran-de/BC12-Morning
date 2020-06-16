package imperative.pwd;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 22.05.2020; Time: 12:28
 */
public class Password {
	public static void main(String[] args) {
		System.out.println(pwdGenerate(21));
		System.out.println(pwdGenerate(10));
		System.out.println(pwdGenerate(30));
		System.out.println(pwdGenerate(5));
		System.out.println(pwdGenerate(25));
		System.out.println(pwdGenerate(15));
	}

	private static String pwdGenerate(int passwordLength) {
		String myPassword = "";

		for (int i = 0; i < passwordLength - 1; i++) {
			if (i % 10 == 0) {
				myPassword = generateDigitsSymbol() + myPassword;
			} else if (i % 2 == 0) {
				myPassword += generateLatinSymbol().toLowerCase();
			} else myPassword += generateLatinSymbol().toUpperCase();
		}
		generateDigitsSymbol();
		return myPassword;
	}


	private static String generateDigitsSymbol() {
		String myDigit = "";
		int temp = (int) (Math.random() * 9);
		myDigit = String.valueOf(temp);
		return myDigit;
	}

	private static String generateLatinSymbol() {
		char myLatinChar;
		myLatinChar = (char) (Math.random() * (90 - 65) + 65);
		return "" + myLatinChar;
	}
}
