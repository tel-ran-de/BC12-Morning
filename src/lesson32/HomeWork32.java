package lesson32;

import java.util.Arrays;

public class HomeWork32 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzBuzz(1, 6)));// → ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(Arrays.toString(fizzBuzz(1, 8)));//→ ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(Arrays.toString(fizzBuzz(1, 11)));//→ ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
        System.out.println(Arrays.toString(fizzBuzz(7, 31)));
    }

    //02-12---Это немного более сложная версия известной проблемы FizzBuzz,
    // которую иногда называют первой проблемой для собеседований. (См. Также: Код FizzBuzz.)
    // Рассмотрим последовательность чисел, начинающуюся с начала и продолжающуюся до,
    // но не включающую конец, поэтому, например, start = 1 и end = 5 дают серии 1, 2, 3, 4.
    // Возвращаем новую строку [] массив, содержащий строковую форму этих чисел,
    // за исключением кратных 3, используйте «Fizz» вместо числа, для кратных 5 используйте «Buzz»,
    // а для кратных 3 и 5 используйте «FizzBuzz». В Java String.valueOf (xxx)
    // сделает строковую форму типа int или другого типа. Эта версия немного сложнее, чем обычная версия,
    // так как вам нужно выделять и индексировать массив,
    // а не просто печатать, и мы меняем начало / конец вместо того, чтобы всегда делать 1..100.
    public static String[] fizzBuzz(int start, int end) {
        String[] array = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 5 == 0) {
                array[i - start] = "Buzz";

            } else if (i % 3 == 0) {
                array[i - start] = "Fizz";
            } else if (i % 3 == 0 && i % 5 == 0) {
                array[i - start] = "FizzBuzz";
            } else {
                array[i - start] = String.valueOf(i);

            }

        }
        return array;
    }
}