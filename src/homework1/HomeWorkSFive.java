package homework1;

import java.util.Scanner;

public class HomeWorkSFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваши значения переменных");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int a4 = input.nextInt();
        int a5 = input.nextInt();
        int a6 = input.nextInt();
        int a7 = input.nextInt();
        if (a1 <= 7) {
            if (a1 == 1) {
                System.out.println("Понедельник");
            }
            if (a2 == 2) {
                System.out.println("Вторник");
            }
            if (a3 == 3) {
                System.out.println("Среда");
            }
            if (a4 == 4) {
                System.out.println("Четверг");
            }
            if (a5 == 5) {
                System.out.println("Пятница");
            }
            if (a6 == 6) {
                System.out.println("Суббота");
            }
            if (a7 == 7) {
                System.out.println("Воскресенье");
            } else if (a1 >= 7 ) ; {
                System.out.println("Ошибка. Введенное число не соотвктвует диапазону");
            }
        }
    }
}

