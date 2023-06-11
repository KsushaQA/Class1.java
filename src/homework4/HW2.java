package homework4;
/*2) Написать перегруженный метод, который может:
        - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
        "Я пустой".
        - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
        - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
        через пробел.
        - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
        массива.
        - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
        "Ваше сообщение - "%%%%%%%%", ваше число -  $",
        где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

public class HW2 {
    public static void print() {
        System.out.println("Я пустой.");
    }

    public static void print(String message) {
        System.out.println("This is a message.");
    }
    public static void print(String[] array) {
        for (String element:array) {
            System.out.print(element + " ");
        }
    }
    public static void print(int[] array2) {
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
            System.out.println();
            System.out.print("Сумма элементов массива равна: " + sum);
        }
    public static void print(String massage, int number) {
        System.out.println();
        System.out.print("Ваше сообщение - " + massage + " Ваше число - " + number);
    }

    public static void main(String[] args) {
        print();
        print("message");
        String[] array = new String[]{"Good", "morning", "everyone", "!!!"};
        print(array);
        int[] array2 = {2,3,4,5};
        print(array2);
        print("Hello, Word!", 40);
        }
    }





