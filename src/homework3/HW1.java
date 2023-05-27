package homework3;

import java.util.Random;
import java.util.Scanner;

/*Масиви

Завдання
Написати програму "числа", яка загадує випадкове число та пропонує гравцеві його вгадати.

Технічні вимоги:

За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
та пропонує гравцеві через консоль ввести своє ім'я, яке зберігається в змінній name.
Перед початком на екран виводиться текст: Let the game begin!

Сам процес гри обробляється у нескінченному циклі.
Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану
кількість з тим, що ввів користувач.
Якщо введене число менше загаданого, програма виводить на екран текст:
Your number is too small. Please, try again.. Якщо введене число більше за загадане,
то програма виводить на екран текст: Your number is too big. Please, try again..
Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!

Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).


Необов'язкове завдання просунутої складності:

Перед переходом на наступну ітерацію, програма зберігає введене користувачем число масив.
Після того, як гравець вгадав загадане число, перед виходом програма виводить на екран текст:
Your numbers: і показує всі введені гравцем числа, відсортовані від більшого до меншого.
Після введення чисел користувачем додати перевірку їх коректності.
Якщо користувач запровадив не число - запитати заново.
Додайте грі трохи більше сенсу: нехай загадане число буде роком,
якому відповідає відома подія. Інформація про роки зберігається
у двовимірному масиві [рік Х подія].
Програма спочатку вибирає випадковим чином комірку в матриці й виводить на екран:
When did the World War II begin?*/
public class HW1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int guess, secretNum;
        while (true) {
            secretNum = rand.nextInt(101);
            System.out.println("Приветствую! Я загадал/(а) число в диапазоне от 0 до 100. Попробуй угадать его");
            System.out.println("Введите свое имя");
            String name = in.nextLine();
            System.out.println("Let the game begin!");
            do {
                System.out.print("Введите Ваше число");
                guess = in.nextInt();
                if (guess < secretNum) {
                    System.out.println("Your number is too small. Please, try again..");
                } else if (guess > secretNum) {
                    System.out.println("Your number is too big. Please, try again..");
                }
            } while (guess != secretNum);
            System.out.println("Congratulations," + name + "!" + " Это число " + secretNum);
            break;
        }
    }
}


