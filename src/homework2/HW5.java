package homework2;

import java.util.Arrays;
import java.util.Scanner;

/*5)Есть одномерный массив из 10 элементов, заполнен-
        ный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном
        до этого массиве.*/
public class HW5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }
        System.out.println("Массив: "+ Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска в массиве:");
        int number = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }

    }
}
