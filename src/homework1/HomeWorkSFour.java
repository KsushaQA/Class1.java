package homework1;

import java.util.Scanner;
//4)Вывести следующие сообщение в отформатированном виде (необходимо добавить спецификаторы формата):
//У вас есть строка:
//Число {X} больше {Y}, и это {True/False}
//Вместо {X},{Y},{True/False} вставляем необходимые спецификаторы формата.
//Для аргументов создаем отдельно переменные, которые запрашиваются для ввода с клавиатуры.
//После ввода с клавиатуры к примеру чисел 5 и 7 должно выводиться сообщение след. типа:
//       Вывод: Число 5 болшье 7, и это false.
public class HomeWorkSFour {
    public static void main(String[] args) {
        System.out.println("Введите число x");
        String text = "Число %1$d больше %2$d, и это %3$b";
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Введите число Y");
        int y = input.nextInt();
        boolean k = x > y;
        System.out.printf(text, x, y, k);
    }
}


