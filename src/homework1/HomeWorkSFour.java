package homework1;

import java.util.Scanner;

public class HomeWorkSFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваши значения переменных");
        int x = input.nextInt();
        int y = input.nextInt();
if (x > y) {
    System.out.println("Это правда");
} else if (x < y) {
    System.out.println("Это ложь");
}
    }
}
