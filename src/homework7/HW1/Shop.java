package homework7.HW1;

public class Shop {
    private String name;
    private double cost;
    private Seller seller;
    private Buyer buyer;
    private Product product;

    public Shop(String name, double cost, Seller seller, Buyer buyer, Product product) {
        this.name = name;
        this.cost = cost;
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
    }
}
