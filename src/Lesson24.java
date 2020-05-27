/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 27.05.2020; Time: 09:37
 * <p>
 * Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение. Для генерации случайного числа используйте метод
 * Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class Lesson24 {
	public static void main(String[] args) {
		myFirstArrayExercise(5);
	}

	public static void myFirstArrayExercise(int elementCounts) {
		int[] digits = new int[elementCounts];

		for (int element : digits) {
			element = (int) (Math.random() * ((100 - 1) + 1));
		}
		System.out.println("-------------");

		for (int i = 0; i < elementCounts; i++) {
			digits[i] = (int) (Math.random() * ((100 - 1) + 1));
			System.out.println(digits[i]);
		}
		System.out.println("-------------");

		int min = digits[0];
		int max = digits[0];
		int middle = 0;

		for (int i = 0; i < elementCounts; i++) {
			if (digits[i] < min) {
				min = digits[i];
			}
		}

		for (int i = 0; i < elementCounts; i++) {
			if (digits[i] > max) {
				max = digits[i];
			}
		}

		for (int i = 0; i < elementCounts; i++) {
			middle = middle + digits[i];
			System.out.println(middle);
		}
		middle = middle / elementCounts;
		System.out.println("Среднее арифметическое значение элементов: " + middle);
		System.out.println("Максимальное значение найдено: " + max);
		System.out.println("Найдено минимальное значение массива: " + min);
	}
}
