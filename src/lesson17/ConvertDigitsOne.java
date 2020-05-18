package lesson17;

import java.util.Scanner;

public class ConvertDigitsOne {

	public static void decimalToBinar() {

		Scanner input = new Scanner(System.in);
		int decimal, remainder;

		String output = "";

		System.out.println("Введи десятичное число, например 13!");
		decimal = input.nextInt();

		while (decimal > 0) {
			remainder = (decimal % 2);
			output = Integer.toString(remainder) + output; // Переводит(вписывает) число в строку.
			decimal = decimal / 2;
		}
		System.out.println(output);
	}

	// двоичные в десятичные
	public static void binaryToDecimal() {
		Scanner input = new Scanner(System.in);
		int remainder, binary; // remainder - остаток
		String output = "";
		System.out.println("Insert your number");
		binary = input.nextInt();
	}

	public static void testMethode() {
		String test = "0757";
		int decimalTest = Integer.parseInt(test, 8);
		System.out.println(decimalTest);
	}
}
