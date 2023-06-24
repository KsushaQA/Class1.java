package homework7.HW2;
import java.util.Random;
import java.util.Scanner;
public class ArrayDivision {
    public double calculateDivision() throws ArrayIndexOutOfBoundsException, ArithmeticException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int arraySize = random.nextInt(30) + 1;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(31);
        }
        System.out.println("Введите индекс элемента массива:");
        int index = scanner.nextInt();
        if (index < 0 || index >= arraySize) {
            throw new ArrayIndexOutOfBoundsException("Индекс должен быть в пределах от 0 до " + (arraySize - 1));
        } if (array[0] == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        return (double) array[index] / array[0];
    }
}

