package homework1;

import java.util.Scanner;
//2)Пользователь вводит с клавиатуры три целочисленных значения
//На экран выводится информация можно ли из этих сторон
//построить треугольник.
public class HomeWorkSTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стороны треугольника:");
        int a = in.nextInt();
        System.out.println("Введите длину стороны треугольника:");
        int b = in.nextInt();
        System.out.println("Введите длину стороны треугольника:");
        int c = in.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Из этих сторон можно построить треугольник");
        } else {
            System.out.println("Из этих сторон нельзя построить треугольник");
        }

    }
}

