package homework7.HW3;

public class Father {
    private String name;
    private int money;

    public Father(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void makePurchase(Product product1, int quantity1, Product product2, int quantity2) throws Exception {
        int totalCost = product1.getPrice() * quantity1 + product2.getPrice() * quantity2;

        if (totalCost > money) {
            throw new Exception("Уважаемый " + name + ", у вас недостаточно денег в кармане!");
        }

        if (product1 == Product.BEER || product1 == Product.TOBACCO ||
                product2 == Product.BEER || product2 == Product.TOBACCO) {
            throw new Exception("Уважаемый " + name + ", вы не можете купить пиво или табак!");
        }

        if (quantity1 % 3 != 0 || quantity2 % 3 != 0) {
            throw new Exception("Уважаемый " + name + ", количество каждого товара должно делиться на три!");
        }

        money -= totalCost;

        System.out.println("Уважаемый " + name + ", стоимость ваших покупок " + totalCost + ".");
        System.out.printf("Вы приобрели %s в количестве %d, и %s в количестве %d.\n", product1.name(),
                quantity1, product2.name(), quantity2);
    }
    }

