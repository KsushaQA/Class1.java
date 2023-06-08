package homework4;

/*1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
        а также нечетные числа списком.*/
public class HW1 {
    public static void main(String[] args) {
        int[] nums = {4,9,20,13,60,45,10,24,55};
        Numbers numbers = new Numbers(nums);
        numbers.printEvenNumbers();
        numbers.printOddNumbers();
    }

    public static class Numbers {
        private int[] array;

        public Numbers(int[] array) {
            this.array = array;
        }

        public void printEvenNumbers() {
            System.out.println("Even Numbers:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.println(array[i] + " ");
                }
            }
        }

        public void printOddNumbers() {
            System.out.println("Odd Numbers:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    System.out.println(array[i] + " ");
                }
            }
        }
    }
}

