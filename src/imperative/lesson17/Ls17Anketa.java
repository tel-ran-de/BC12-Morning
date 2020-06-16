package imperative.lesson17;

import java.util.Scanner;

public class Ls17Anketa {
	//Напишите программу, которой надо представиться.
	// Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
	// Для считывания данных типа String используйте метод next(): input.next()

	public static void getNameAndDetails() {

		String name = "";
		String secondName = "";
		String age = "";
		String profession = "";
		int k = 2;

		Scanner input = new Scanner(System.in);

		int i = 0;

		do {
			System.out.print("Введите Ваше имя: ");
			name = input.next();
			System.out.print("Фамилию? ");
			secondName = input.next();
			System.out.print("Возраст: ");
			age = input.next();
			System.out.print("Ваша профессия: ");
			profession = input.next();
			if (i == 1) {
				System.out.printf("%-12s%-12s%-12s%-12s\n", "Имя", "Фамилия", "Возраст", "Профессия");
			}
			myFormat(name, secondName, age, profession);

		} while (i < k);

		System.out.println("Анкетирование закончено.");
	}

////    public static void main(String[] args) {
////        myFormat("Andrey", "Sidorov", 18, "student");
//    }

	private static void myFormat(String name, String secondName, String age, String profession) {
		System.out.printf("%-12s%-12s%-12s%-12s\n", name, secondName, age, profession);

	}
}
