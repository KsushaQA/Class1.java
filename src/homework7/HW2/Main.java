package homework7.HW2;

public class Main {
    public static void main(String[] args) {
        ArrayDivision arrayDivision = new ArrayDivision();
        try {
            double result = arrayDivision.calculateDivision();
            System.out.println("Результат деления: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
