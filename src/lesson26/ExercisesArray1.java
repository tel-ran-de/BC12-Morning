package lesson26;

import java.util.Arrays;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 29.05.2020; Time: 11:51
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */
public class ExercisesArray1 {
	public static void main(String[] args) {
/*		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = {8, 6, 7, 5, 3, 0, 9};
		int[] a3 = {1, 2, 3};

		System.out.println(Arrays.toString(midThree(a1)));
		System.out.println(Arrays.toString(midThree(a2)));
		System.out.println(Arrays.toString(midThree(a3)));*/

/*		int[] a1 = {1, 2, 3};
		int[] a2 = {1, 2, 3, 1};
		int[] a3 = {1, 2, 1};

		System.out.println(sameFirstLast(a1));
		System.out.println(sameFirstLast(a2));
		System.out.println(sameFirstLast(a3));*/

/*		int[] m1 = {1, 2, 3};
		int[] m2 = {11, 5, 9};
		int[] m3 = {2, 11, 3};
		int[] m4 = {2, 11, 2};
		System.out.println(Arrays.toString(maxEnd3(m1))); // [3, 3, 3]
		System.out.println(Arrays.toString(maxEnd3(m2))); //[11, 11, 11]
		System.out.println(Arrays.toString(maxEnd3(m3))); // [3, 3, 3]
		System.out.println(Arrays.toString(maxEnd3(m4))); // [2, 11, 2]*/
/*		int[] a1 = {4, 5, 6};
		int[] a2 = {1, 2};
		int[] a3 = {3};
		System.out.println(Arrays.toString(makeLast(a1)));// [0, 0, 0, 0, 0, 6]
		System.out.println(Arrays.toString(makeLast(a2)));//  [0, 0, 0, 2]
		System.out.println(Arrays.toString(makeLast(a3)));// [0, 3]*/
		int[] myTest1 = {1, 2, 3};
		int[] myTest2 = {1, 3};
		int[] yourTest1 = {7, 2, 3};
		int[] yourTest2 = {1};
		int[] anotherTest1 = {1, 2};
		int[] anotherTest2 = {};

		System.out.println(start1(myTest1, myTest2));
		System.out.println(start1(yourTest1, yourTest2));
		System.out.println(start1(anotherTest1, anotherTest2));
	}

	// 01_15
	public static int start1(int[] a1, int[] a2) {
		int count = 0;
		for (int element : a1) {
			if (element == 1) count++;
		}
		for (int i = 0; i < a2.length; i++) {
			if (a2[i] == 1) count++;
		}
		return count;
	}


	//01_14
	public static double[] makeLast(int[] array) {
		double[] output = new double[array.length * 2];
		output[output.length - 1] = array[array.length - 1];
		return output;
	}

	// 01_12
	public static int[] maxEnd3(int[] array) {
		if (array[0] > array[array.length - 1]) {
			Arrays.fill(array, array[0]);
		} else if (array[array.length - 1] > array[0]) {
			Arrays.fill(array, array[array.length - 1]);
		}
		return array;
	}

	// 01_10
	public static boolean sameFirstLast(int[] array) {

		return array.length > 1 && array[0] == array[array.length - 1];
	}

	// 01-08
	public static int[] midThree(int[] array) {
		int[] output = new int[3];
		output[0] = array[array.length / 2 - 1];
		output[1] = array[array.length / 2];
		output[2] = array[array.length / 2 + 1];
		return output;
	}
}
