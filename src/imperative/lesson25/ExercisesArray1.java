package imperative.lesson25;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 28.05.2020; Time: 12:11
 */
public class ExercisesArray1 {
	public static void main(String[] args) {
/*		int[] a1 = {1, 2, 3, 5, 6, 2, 3, 8};   // [1, 2, 0]
		int[] a2 = {2, 3, 5, 3, 2, 3, 5, 6, 2, 3};   // [2, 0, 5]
		int[] a3 = {1, 2, 1, 1, 2, 3, 5, 6, 2, 3};   // [1, 2, 1]
		myIntArrayPrint(fix23(a1));
		myIntArrayPrint(fix23(a2));
		myIntArrayPrint(fix23(a3));*/

		int[] mm1 = {1, 2, 3, 4};
		int[] mm2 = {7, 1, 2, 3, 4, 9};
		int[] mm3 = {1, 2};

		myIntArrayPrint(makeMiddleEven(mm1)); // [2, 3]
		myIntArrayPrint(makeMiddleEven(mm2)); // [2, 3]
		myIntArrayPrint(makeMiddleEven(mm3)); // [1, 2]
	}

	public static int[] makeMiddleEven(int[] array) {
		int[] output = new int[2];
		output[0] = array[array.length / 2 - 1];
		output[1] = array[array.length / 2];
		return output;
	}

	public static int[] fix23(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 2 && array[i + 1] == 3) {
				array[i + 1] = 0;
			}
		}
		return array;
	}

	private static void myIntArrayPrint(int[] array) {
		for (int value : array) {
			System.out.print(value + ", ");
		}
		System.out.println("-------------------");
	}

}
