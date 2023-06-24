package homework7.HW1;

public class Product {
    private String name;
    private boolean isAlcoholic;

    public Product(String name, boolean isAlcoholic) {
        this.name = name;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
