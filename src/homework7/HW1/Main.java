package homework7.HW1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("водку", true);
        Seller seller = new Seller("Ольга", false);
        Buyer buyer = new Buyer("Игорь", 15, true);
        Shop shop = new Shop("Сильпо", 200, seller, buyer, product);
        shop.returnCost();
    }
}
