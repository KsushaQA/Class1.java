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
}

