package pwd;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 25.05.2020; Time: 12:32
 */
public class TryAndCryPassword {
	public static void main(String[] args) {
		System.out.println(pwdGenerate(21, "l"));
		System.out.println(pwdGenerate(10, "c"));
		System.out.println(pwdGenerate(30, "n"));
		System.out.println(pwdGenerate(5, "m"));
		System.out.println(pwdGenerate(25, "lcnm"));
		System.out.println(pwdGenerate(15, "lcnm"));
	}

	private static String pwdGenerate(int pwdLength, String arguments) {
		String sourceLatin = "abcdefgdpowurtklvncmxc";
		String sourceNumber = "0123456789";
		String sourceMagicSymbols = "!?&:§№";
		String sourceCyrillic = "чявертзуиопопююэёллкйхгфдссаыьжмцбн";
		String result = "";
		String sourceFinal = "";

		if (arguments.contains("l")) sourceFinal = sourceFinal + sourceLatin;
		if (arguments.contains("c")) sourceFinal = sourceFinal + sourceCyrillic;
		if (arguments.contains("m")) sourceFinal = sourceFinal + sourceMagicSymbols;
		if (arguments.contains("n")) sourceFinal = sourceFinal + sourceNumber;

		for (int i = 0; i < pwdLength; i++) {
			int randomInt = (int) (Math.random() * (sourceFinal.length() - 1));
			char newSymbol = sourceFinal.charAt(randomInt);
			result = result + newSymbol;
		}
		return result;
	}
}
