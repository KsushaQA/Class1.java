package HW1;

public class Computer2 {
    private String brand;
    private int cost;
    private int RAM;
    private int videoCard;

    public Computer2(String brand, int cost, int RAM, int videoCard) {
        this.brand = brand;
        this.cost = cost;
        this.RAM = RAM;
        this.videoCard = videoCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString(){
        return "Создан РС." + "\n" + "Имя=" + brand + ". " + "\n"+
                "Цена=" + cost + "." + "\n" + "Видео карта=" + videoCard + "." +"\n" + "ОЗУ=" + RAM + ".";
    }
}
