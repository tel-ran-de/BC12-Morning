# Пузырьковая сортировка - Bubble Sort (simple)

## Обмен значений переменных

Мы уже знакомились с пузырьковой сортировкой во время ознакомления с рекурсией. И прежде чем вспоминать сортировку давайте отвлечёмся на секунду и подумаем как можно менять значения у переменных местами.

Допустим у нас есть переменная **A** со значением **5**  и переменная **B** со значением **3
**. Как можно поменять их местами не создавая новую переменную.

```java
public class obj.Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // меняем местами пошагово
        a = a + b;
        b = a - b;
        a = a - b;
        // меняем местами в одну строчку.
        a = a + b - (b = a);
        // меняем местами пошагово с помощью XOR
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
    }
}
```

Вариант с созданием дополнительной переменной легко читаемый и понятный всеми вариант. Данный пример приведён для разминки перед сортировками. Попробуйте дополнительно поменять местами переменные используя другие арифметические знаки. 

## Пузырьковая сортировка

В пузырьковой сортировке мы по очереди просматриваем попарно весь массив. Для визуализации можно ещэ раз посмотреть [прекрасный танец](https://www.youtube.com/watch?v=lyZQPjUT5B4).


### Bubble Sort и рекурсия

![](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

```java
public class BubbleSort {
	static void bubbleSortRec(int[] arrUnsort) {
		int count = 0;
		for (int i = 0; i < arrUnsort.length - 1; i++)
			if (arrUnsort[i] > arrUnsort[i + 1]) {
				int temp = arrUnsort[i];
				arrUnsort[i] = arrUnsort[i + 1];
				arrUnsort[i + 1] = temp;
				count++;
			}
		if (count > 0) {
			bubbleSortRec(arrUnsort);
		}
	}
}
```

### Bubble Sort без рекурсии

```java
public class obj.Main {
    public static void bubbleSort(int[] array) {
        boolean unsorted = true;
        int temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
```

## Пузырьковая сортировка строковых значений по алфавиту

```java
import java.util.Arrays;

public class obj.Main {
    public static void main(String[] args) {
        String name = "Andrej";
        String[] array = name.split("");
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static String[] bubbleSort(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1].toLowerCase().compareTo(array[i].toLowerCase()) < 0) {
                String tempStr = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tempStr;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
        return array;
    }
}
```

## Дополнительные материалы 

1. https://habr.com/ru/post/204600/
