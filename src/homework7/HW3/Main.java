package homework7.HW3;

public class Main {
    public static void main(String[] args) {
        Father father = new Father("Валентин", 500);
        try {
            father.makePurchase(Product.APPLE, 3, Product.MILK, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
}

