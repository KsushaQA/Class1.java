package HW1;

import java.util.Objects;

/*1) Создать класс Computer c конструктором принимающим параметры
        Марка тип String, цена тип int, оперативная память тип int,
        и видеокарта тип int.
        Переопределить метод toString для вывода объекта класса в след. виде:
        "Создан PC.
        Имя = марка.
        Цена = цена.
        Видеокарта = объем видеокарты
        ОЗУ = Объем оперативной памяти."

        Все поля класса Computer должны быть приватными.
        Также создайте публичные методы для получения информации о полях класса Computer.
        А также методы для изменения его полей.

        Переопределите метод equals и метод hashCode для вашего класса.
        Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
        равны значения полей марка, оперативная память и видеокарта.

        В отдельном классе создайте объект класса компьютер, и выведите в консоль
        информацию о вашем объекте.*/
public class Computer {
    private String brand;
    private int cost;
    private int RAM;
    private int videoCard;

    public Computer(String brand, int cost, int RAM, int videoCard) {
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
 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand) && Objects.equals(RAM, computer.RAM)
                && Objects.equals(videoCard, computer.videoCard);
    }*/
    /*@Override
    public int hashCode() {
        return Objects.hash(brand, RAM, videoCard);
    }*/
}







