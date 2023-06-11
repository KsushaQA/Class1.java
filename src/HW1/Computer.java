package HW1;
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
        public String brand;
        public int cost;
        public int RAM;
        public int videoCard;

    public Computer(String brand, int cost, int RAM, int videoCard) {
        this.brand = brand;
        this.cost = cost;
        this.RAM = RAM;
        this.videoCard = videoCard;
    }
}

