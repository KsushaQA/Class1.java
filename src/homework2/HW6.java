package homework2;
/*6)Заполнить массив на 45 элементов случайными числами
        от -50 до +50. Найти минимальный элемент и вывести его
        на консоль. Найти максимальный элемент и вывести его на
        консоль.*/
public class HW6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 101) - 50);
            System.out.print(array[i] + " ");
        }
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("\n" + "Minimum value is: " + minValue);
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("\n" + "Maximum value is: " + maxValue);
    }
}
