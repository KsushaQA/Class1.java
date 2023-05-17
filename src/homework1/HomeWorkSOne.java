package homework1;

import java.util.Scanner;

public class HomeWorkSOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите Ваш текс");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        String s4 = input.next() + " " + input.next() + " " + input.next();
        System.out.println("Ваш введенный текст: " + s1);
        System.out.println("Ваш введенный текст: " + s2);
        System.out.println("Ваш введенный текст: " + s3);
        System.out.println("Ваш введенный текст: " + s4);
    }
}
