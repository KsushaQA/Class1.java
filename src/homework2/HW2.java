package homework2;

import java.util.Scanner;

/*2)Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        String number = scanner.nextLine();
        String result = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            result = result + number.charAt(i);
        }
        if (result.equals(number)) {
            System.out.println("This is palindrom");
        } else {
            System.out.println("This is not palindrom");
        }
    }
}

