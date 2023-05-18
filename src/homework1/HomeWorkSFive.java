package homework1;

import java.util.Scanner;

public class HomeWorkSFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваши значения переменных");
        int a1 = input.nextInt();

            if (a1 == 1) {
                System.out.println("Понедельник");
            }
            else if (a1 == 2) {
                System.out.println("Вторник");
            }
            else if (a1 == 3) {
                System.out.println("Среда");
            }
            else if (a1 == 4) {
                System.out.println("Четверг");
            }
            else if (a1 == 5) {
                System.out.println("Пятница");
            }
            else if (a1 == 6) {
                System.out.println("Суббота");
            }
            else if (a1 == 7) {
                System.out.println("Воскресенье");
            } else {
                System.out.println("Ошибка. Введенное число не соотвктвует диапазону");
            }
        }
    }





