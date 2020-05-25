package lesson22;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 25.05.2020; Time: 09:37
 */
public class MyLovelyLesson {

	public static void main(String[] args) {
		System.out.println(withoutX("xHix"));
		System.out.println(withoutX("xHi"));
		System.out.println(withoutX("Hxix"));
	}

	private static boolean mixStart(String str) {
		return str.substring(1, 3).equals("ix");
	}

	public static int teaParty(int tea, int candy) {
		if (tea >= 5 && candy >= tea * 2 | tea >= candy * 2 && candy >= 5) return 2;
		else if (tea >= 5 && candy >= 5) return 1;
		else return 0;
	}

	public static String withoutX(String text) {
		String result = text;
		char x = 'x';

		if (result.charAt(0) == x) {
			result = result.substring(1);
		}

		if (result.charAt(result.length() - 1) == x) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
}
