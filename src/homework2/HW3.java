package homework2;

import java.util.Scanner;

/*3)Написать проограмму, условно для склада приема металла. Представим, что склад
        может хранить определенный вес металла. Пользователь вводит с
        клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
        с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять
        склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        о невозможности приемки такого малого веса. Программа завершается, когда
        место на складе закончилось.*/
public class HW3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Максимальный вес, к-рый хранится на складе");
        int maxWeight = in.nextInt();
        System.out.println("Минимальный вес, к-рый хранится на складе");
        int minWeight = in.nextInt();
        while (maxWeight > 0) {
            System.out.println("Введите вес, который вы хотите сдать на склад: ");
            int weight = in.nextInt();

            if (weight < 5) {
                System.out.println("Невозможно принять металл весом менее 5 кг");
            } else if (weight > maxWeight) {
                System.out.println("Невозможно принять металл. Превышен остаток на складе.");
            } else if (maxWeight - weight == 0) {
                System.out.println("Склад заполнен. Программа завершена.");
                break;
            } else if (maxWeight - weight < 5) {
                System.out.println("Невозможно принять металл. Недопустимый остаток на складе.");
            } else {
                maxWeight -= weight;
                System.out.println("Принят металл весом: " + weight);
                System.out.println("Осталось места на складе: " + (maxWeight));
            }
        }
    }
}


