package imperative.lesson25;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 28.05.2020; Time: 10:12
 */
public class GutenTagArray {
	public static void main(String[] args) {
		// [1,2,3,4]
		int[] array1 = new int[3];
		array1[0] = 13;
		int[] array2 = new int[]{4, 5, 7};
		int[] array3 = myIntArrayPrint(array1);
		int[] array4;
		myIntPrint(array1);
		myIntPrint(array2);
		myIntPrint(new int[3]);
		myIntPrint(new int[]{1, 2, 3});
		myIntPrint(new int[]{1, 2, 3});
		int a = 5;
		int b = 7;
		int c = sum(a, b);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	private static void myIntPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("--------------");
	}

	private static int[] myIntArrayPrint(int[] array) {
		for (int value : array) {
			System.out.print(value + ", ");
		}
		return array;
	}

	public static int additionArray(int[] myLittleArray) {
		int sum = 0;
		for (int i = 0; i < myLittleArray.length; i++) {
			sum = sum + myLittleArray[i];
		}
		return sum / myLittleArray.length;
	}
}
