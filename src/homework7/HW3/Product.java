package homework7.HW3;

public enum Product {
    APPLE(30), POTATO(10), MILK(35), BEER(40), TOBACCO(100);

    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
