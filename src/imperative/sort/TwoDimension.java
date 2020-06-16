package imperative.sort;

import java.util.Arrays;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 28.05.2020; Time: 20:05
 */
public class TwoDimension {
	public static void main(String[] args) {

		String[][] myArray = new String[5][3];

		myArray[0][0] = "1";
		myArray[0][1] = "Матвеев";
		myArray[0][2] = "№01978434";

		myArray[1][0] = "2";
		myArray[1][1] = "Сергеев";
		myArray[1][2] = "№21321434";

		myArray[2][0] = "3";
		myArray[2][1] = "Васечкин";
		myArray[2][2] = "№412345678";

		myArray[3][0] = "4";
		myArray[3][1] = "Петечкин";
		myArray[3][2] = "№587654321";

		myArray[3][0] = "4";
		myArray[3][1] = "Герасимов";
		myArray[3][2] = "№587654321";


		byte[][][] byteArray = {
				{
						{0, 1, 2},
						{1, 2, 3},
						{3, 4, 5}
				},
				{
						{1, 2, 3},
						{2, 3, 4},
						{5, 6, 7}
				}
		};

		int[][] a1 = new int[5][];// двумерный массив с 5 строками
		a1[0] = new int[1];
		a1[1] = new int[2];
		a1[2] = new int[3];
		a1[3] = new int[4];
		a1[4] = new int[5];

		for (int[] array : a1) {
			for (int element : array) {
				System.out.print(element + " ");
			}
			System.out.println();
		}


		int[][] example = {
				{1},
				{2, 2},
				{3, 3, 3},
				{4, 4, 4, 4},
				{5, 5, 5, 5, 5}
		};

		int arr[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
		// To fill complete array with a particular value
		Arrays.fill(arr, 10);
		System.out.println("Array completely filled with 10\n" + Arrays.toString(arr));
	}
}
