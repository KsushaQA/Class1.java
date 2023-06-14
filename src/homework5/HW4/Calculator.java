package homework5.HW4;

import java.util.Scanner;

/*4) Создать класс калькулятор.
        В нем создать методы:
        summ, minus, multiply, division.
        Сложение, вычитание, умножение и деление соответственно.
        Каждый метод принимает в качестве параметров два значения типа double.
        И выводит в консоль результат действия.

        Также в классе есть метод старт. Который выводит сообщение в консоль, что
        калькулятор запущен. И предлагает ввести действие в вашей консоли.

        Калькулятор должен принимать только следующие типы действий:
        2+4;    - пример синтаксиса сложения;
        5-6;    - пример синтаксиса вычитания;
        25*3;   - пример синтаксиса умножения;
        34/3;   - пример синтаксиса деления;
        После ввода действия на консоль выводится ответ этого действия.
        И после снова выводится сообщение о предложении ввести действие.

        в случае ввода другого синтаксисана консоль возвращается сообщение:
        "Введите корректное действие".
        И после снова выводится сообщение о предложении ввести действие.

        Программа закрывается после ввода команды Stop.
        Перед закрытием на консоль должно выводится сообщение:
        "Калькулятор закрыт".*/
public class Calculator {
    public static double summ(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор запущен. Введите действие (например, число/оператор(+|-|*|/)/число, или введите Stop для выхода:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Калькулятор закрыт.");
                return;
            }

            String[] parts = input.split("\s*([-+*/])\s*");

            if (parts.length != 2) {
                System.out.println("Введите корректное действие.");
                continue;
            }

            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            double result;

            if (input.contains("+")) {
                result = summ(a, b);
            } else if (input.contains("-")) {
                result = minus(a, b);
            } else if (input.contains("*")) {
                result = multiply(a, b);
            } else {
                result = division(a, b);
            }

            System.out.println(result);
            System.out.println("Введите действие (например, число/оператор(+|-|*|/)/число, или введите Stop для выхода:");
        }
    }
}






