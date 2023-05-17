package homework1;

import java.util.Date;
import java.util.Scanner;

public class HomeWorkSThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год вашего рождения:");
        int yearOfBirth = in.nextInt();
        Date date = new Date();

        System.out.println(date);

        String actualYear = String.format("%tY",date);

        int actualYearInt = Integer.parseInt(actualYear);
        System.out.println("Ваш возраст равен "+(actualYearInt-yearOfBirth));
    }
    }

