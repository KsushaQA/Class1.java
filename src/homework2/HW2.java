package homework2;

import java.util.Scanner;

/*2)Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/
public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int num = scanner.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;
        while (num !=0) {
            reversedNum = reversedNum *10 + num%10;
            num/=10;
        }
        return originalNum == reversedNum;
    }

    }

