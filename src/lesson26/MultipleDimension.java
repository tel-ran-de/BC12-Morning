package lesson26;

import java.util.Arrays;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 29.05.2020; Time: 10:16
 */
public class MultipleDimension {
	public static void main(String[] args) {
		// month();
		// schoolTable();
		// myLovelyInt();
		//simpleExample();
		justExample();
	}
	public static void justExample() {
		int arr[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
		// To fill complete array with a particular value
		Arrays.fill(arr, 10);
		System.out.println("Array completely filled with 10\n" + Arrays.toString(arr));
		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
	}
	public static void simpleExample() {
		int[][] example = {
				{1},
				{2, 2},
				{3, 3, 3},
				{4, 4, 4, 4},
				{5, 5, 5, 5, 5},
		};
		for (int[] littleArray : example) {
			for (int value : littleArray) {
				System.out.print(value + " ");
			}
			System.out.println("");
		}
	}


	public static void threeDimension() {
		int[][][] a1 = new int[10][20][30];

		byte[][][] byteArray = {
				{
						{0, 1, 2},
						{3, 4, 5},
						{6, 7, 8, 15, 56}
				},
				{
						{12, 13, 14, 18},
						{15, 16, 17},
						{100, 101, 120}
				}
		};
	}

	public static void myLovelyInt() {
		int[][] myLittleArray = new int[5][];
		myLittleArray[0] = new int[1];
		myLittleArray[1] = new int[2];
		myLittleArray[2] = new int[3];
		myLittleArray[3] = new int[4];
		myLittleArray[4] = new int[5];

		for (int[] veryLittleArray : myLittleArray) {
			for (int elementik : veryLittleArray) {
				System.out.print(elementik + " ");
			}
			System.out.println("");
		}
	}

	public static void month() {
		int[][] monthCalendar;
		monthCalendar = new int[4][7];
		for (int row = 0; row < monthCalendar.length; row++) {
			for (int column = 0; column < monthCalendar[row].length; column++) {
				monthCalendar[row][column] = row * 7 + column + 1;
				System.out.print(" " + monthCalendar[row][column]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Plz Computer, print me element [1][3], I expect 11: " + monthCalendar[1][3]);
	}

	public static void schoolTable() {
		String[][] myLovelyArray = new String[6][3];

		myLovelyArray[0][0] = "1";
		myLovelyArray[0][1] = "Матвеев";
		myLovelyArray[0][2] = "№01978434";

		myLovelyArray[1][0] = "2";
		myLovelyArray[1][1] = "Васечкин";
		myLovelyArray[1][2] = "№21321434";

		myLovelyArray[2][0] = "3";
		myLovelyArray[2][1] = "Сидоров";
		myLovelyArray[2][2] = "№412345678";

		myLovelyArray[3][0] = "4";
		myLovelyArray[3][1] = "Петечкин";
		myLovelyArray[3][2] = "№587654321";

		myLovelyArray[4][0] = "5";
		myLovelyArray[4][1] = "Герасимов";
		myLovelyArray[4][2] = "№79898321";

		myLovelyArray[5][0] = "6";
		myLovelyArray[5][1] = "Папин-Африканец";
		myLovelyArray[5][2] = "№79898321";

		for (String[] littleArray : myLovelyArray) {
			for (String value : littleArray) {
				System.out.print(value + " ");
			}
			System.out.println("");
		}
	}
}
