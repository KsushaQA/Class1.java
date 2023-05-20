package homework1;

import java.util.Scanner;

//  /*1) У вас есть строка "Я тестирую замечательно. Что еще нужно?",
//Которую нужно ввести с клавиатуры в консоль.
//Необходимо при помощи только  метода next() класса Scanner
//(не используем метод nextLine())
//присвоить перемнным типа String следующие значения:
//string1 = Я
//string2 = тестирую
//string3 = замечательно
//string4 = Что еще нужно?
//Помимо string1, string2, string3, string4 новых переменных
//создавать нельзя.
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
