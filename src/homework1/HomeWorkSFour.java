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
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваши значения переменных");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            System.out.println("Число 7 больше 5, и это true.");
        } else if (x < y) {
            System.out.println("Число 5 больше 7, и это false.");
        }
    }
}


