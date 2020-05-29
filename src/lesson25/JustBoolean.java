package lesson25;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 28.05.2020; Time: 10:03
 */
public class JustBoolean {
	public static void main(String[] args) {
		//05
		int[] a = new int[]{4, 5};
		int[] b = new int[]{4, 2};
		int[] c = new int[]{3, 5};
		System.out.println(no23(a)); //true
		System.out.println(no23(b)); //false
		System.out.println(no23(c)); //false
	}
	public static void trip(boolean vacation, boolean weekend){
		if(vacation || !weekend){
			System.out.println("Мы едем в отупск");
		}
		System.out.println("мы никуда не едем");
	}
	public static boolean no23(int[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i] == 2 || args[i] == 3) {
				return false;
			}
		}
		return true;
	}
}
