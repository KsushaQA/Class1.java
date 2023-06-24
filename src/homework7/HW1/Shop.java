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

    public String getName() {
        return name;
    }

    public void returnCost() {
        double finalCost = cost;
        if (buyer.isHasDiscountCard()) {
            finalCost *= 0.9;
        }
        if (seller.isHonest() || !product.isAlcoholic()) {
            if (buyer.getAge() >= 18) {
                System.out.println("Уважаемый " + buyer.getName() +
                        ", продавец " + seller.getName() +
                        " нашего магазина " + name + ", продаст Вам выбранный товар " +
                        product.getName() + ", в нем содержится алкоголь, а Ваш возраст " +
                        buyer.getAge() + ".\nСтоимость вашей покупки равна " +
                        finalCost + ", с учетом Вашей скидки.");
            } else {
                System.out.println("Продавец " + seller.getName() +
                        " не может продать вам этот товар " +
                        product.getName() + ", так как вы несовершеннолетний.");
            }
        } else {
            System.out.println("Уважаемый " + buyer.getName() +
                    ", продавец " + seller.getName() +
                    " нашего магазина " + name + ", продаст Вам выбранный товар " +
                    product.getName() + ", не смотря на то, что Вы несовершеннолетний, Вам только " +
                    buyer.getAge() + ".\nСтоимость вашей покупки равна " +
                    finalCost + ", с учетом Вашей скидки.");
        }
    }
}
