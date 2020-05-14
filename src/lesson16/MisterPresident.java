package lesson16;

import java.util.Scanner;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 14.05.2020; Time: 12:02
 * Президент приходит к власти если набрал 51% голосов избирателей. Создайте машину для ввода результатов выборов.
 */
public class MisterPresident {
	public static void electionResult() {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		System.out.println("Скажите как зовут кандидата?");
		name = myScanner.next();
		double result = 0;
		// Scanner myScanner2 = new Scanner(System.in);
		System.out.println("Сколько процентов голосов набрал кандидат " + name);
		result = myScanner.nextDouble();

		double minVote = 50;
		if (result >= 100) {
			System.out.println("Обнаружена попытка манипуляции результатами выборов! Вызываю полицию!");
		} else if (result > minVote) {
			System.out.println("У нас новый президент, поздравляю мистер " + name);
		} else {
			System.out.println("К сожалению мистер " + name + " не набрал необходимые " + minVote + " процентов");
		}
	}
}
