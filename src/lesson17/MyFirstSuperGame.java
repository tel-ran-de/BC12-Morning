package lesson17;

import java.util.Scanner;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 15.05.2020; Time: 09:54
 */
//Компьютер загадывает число от 1 до n.
// У пользователя k попыток отгадать.
// После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
// В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
public class MyFirstSuperGame {
	public static void startGame() {
		int min = 1;
		int max = 100;
		int k = 0;
		int randomDigit = myRandom(min, max);
		//System.out.println("Техническая распечатка randomDigit: " + randomDigit);
		int guessDigit = 0;

		String win = "You Win!!!";
		String lose = "You LOOSER!!!";
		String more = "Указанное число больше";
		String less = "Указанное число меньше";
		String temp = "";


		Scanner input = new Scanner(System.in);
		System.out.println("Приветствую вас на голодных играх!\n" +
				"Сколько попыток вам дать?\n" +
				"Выберите уровень сложности 1 или 2 или 3 :");
		k = input.nextInt();

		for (int i = 0; i < k; i++) {

			System.out.println("Угадай-ка загаданное мною число, ты кожаный мешок с костями!");
			guessDigit = input.nextInt();

			if (guessDigit == randomDigit) {
				temp = win;
				System.out.println(temp);
				break;
			} else if (guessDigit > randomDigit) {
				temp = less;
				System.out.println(temp);
			} else {
				temp = more;
				System.out.println(temp);
			}
		}
		System.out.println("Игра закончена!");
	}

	private static int myRandom(int min, int max) {
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
}
