package homework5.HW2;
/*2) Создать класс Tree с перегруженными конструкторами.
        В классе есть Tree есть поля:
        String type; int height, int coutOfsticks, String colour;

        Конструктор1 принимающий в параметры String type; int height
        и присваивающий значение полям coutOfsticks значение 13,
        colour "Зеленый".

        Конструктор2 принимающий в параметры int height, int coutOfsticks,
        String colour и присваивающий значение полю type "пихта".

        Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
        сolour = "Желтый".

        Конструктор4 который принимает в параметры String type,
        и вызывает внутри себя конструктор 3.

        Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/

public class Tree {
    String type;
    int height;
    int countOfsticks;
    String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfsticks = 13;
        this.colour = "Зеленый";
    }

    public Tree(int height, int countOfsticks, String colour) {
        this.type = "пихта";
        this.height = height;
        this.countOfsticks = countOfsticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfsticks = 29;
        this.colour = "желтый";
    }

    public Tree(String type) {
        this();
        this.type = type;
    }
}
