package homework1;

import java.util.Scanner;
//5)(Использовать операторы if-else-if)
//Пользоватьель вводит с клавиатуры числа:
//Если число равно 1, то выводин на консоль "Понедельник";
//Если число равно 2, то выводин на консоль "Вторник";
//Если число равно 3, то выводин на консоль "Среда";
//Если число равно 4, то выводин на консоль "Четверг";
//Если число равно 5, то выводин на консоль "Пятница";
//Если число равно 6, то выводин на консоль "Суббота";
//Если число равно 7, то выводин на консоль "Воскресенье";
//В противном случае выводим текст:
//"Лучше бы сегодня была пятница".
public class HomeWorkSFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваши значения переменных");
        int a1 = input.nextInt();

        if (a1 == 1) {
            System.out.println("Понедельник");
        } else if (a1 == 2) {
            System.out.println("Вторник");
        } else if (a1 == 3) {
            System.out.println("Среда");
        } else if (a1 == 4) {
            System.out.println("Четверг");
        } else if (a1 == 5) {
            System.out.println("Пятница");
        } else if (a1 == 6) {
            System.out.println("Суббота");
        } else if (a1 == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница.");
        }
    }
}





