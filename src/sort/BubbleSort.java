package sort;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 28.05.2020; Time: 11:05
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] unSortArray = new int[]{104, 64, 34, 25, 12, 22, 11, 90};
		myArrayPrint(bubbleSort(unSortArray));
	}

	public static int[] bubbleSort(int[] myArray) {
		int countChanging = 0;
		for (int i = 0; i < myArray.length - 1; i++) {
			if (myArray[i] > myArray[i + 1]) {
				int temp = myArray[i];
				myArray[i] = myArray[i + 1];
				myArray[i + 1] = temp;
				countChanging++;
			}
			// второе
		}
		System.out.println("Count: " + countChanging);
		if (countChanging > 0) {
			bubbleSort(myArray);
		}
		return myArray;
	}

	public static void myArrayPrint(int[] arrayToPrint) {
		for (int value : arrayToPrint) {
			System.out.println(value);
		}
	}
}
