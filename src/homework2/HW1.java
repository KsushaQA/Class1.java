package homework2;

import java.util.Scanner;

/*1)Написать программу, которая будет считывать введенные пользователем
        слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
        пока пользователь не введет с клавитуры слово STOP.
        Все слова введенные до этого должны отобразится в консоли
        одним предложением.*/
public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        while (true) {
            System.out.println("Введите ваше слово (для остановки напишити STOP)");
            String word = scanner.nextLine();
            if (word.equals("STOP")) {
                break;
            }
            result = result + word;
        }
        System.out.println(result);
    }
}
