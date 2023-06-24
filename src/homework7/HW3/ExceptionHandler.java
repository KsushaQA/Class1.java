package homework7.HW3;

public class ExceptionHandler {
    public static void handleExceptions(Father father, Product product1,
                                        int quantity1, Product product2, int quantity2) {
        try {
            father.makePurchase(product1, quantity1, product2, quantity2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
