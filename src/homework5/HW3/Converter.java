package homework5.HW3;
/*3) Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
        метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
        convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
        converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
        У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
        А также только один метод геттер для получения информации о названии данного конвертра.*/
public class Converter {
    public String name;
    public Converter(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int convertToInt(byte b){
        return b;
    }
    public int convertToInt(short s){
        return s;
    }
    public int convertToInt(int i){
        return i;
    }
    public int convertToInt(long l){
        return (int) l;
    }
    public int convertToInt(char c){
        return c;
    }
    public int convertToInt(float f){
        return (int) f;
    }
    public int convertToInt(double d){
        return (int) d;
    }
    public int convertToInt(String s){
        return Integer.parseInt(s);
    }
    public int convertToInt(boolean b){
        System.out.println("введен тип boolean");
        return 0;
    }
    public int convertToDouble(byte b){
        return b;
    }
    public int convertToDouble(short s){
        return s;
    }
    public int convertToDouble(int i){
        return i;
    }
    public int convertToDouble(long l){
        return (int) l;
    }
    public int convertToDouble(char c){
        return c;
    }
    public int cconvertToDouble(float f){
        return (int) f;
    }
    public int convertToDouble(double d){
        return (int) d;
    }
    public int convertToDouble(String s){
        return Integer.parseInt(s);
    }
    public int convertToDouble(boolean b){
        System.out.println("введен тип boolean");
        return 0;
    }
    public int converToString(byte b){
        return b;
    }
    public int converToString(short s){
        return s;
    }
    public int converToString(int i){
        return i;
    }
    public int converToString(long l){
        return (int) l;
    }
    public int converToString(char c){
        return c;
    }
    public int converToString(boolean b){
        return 0;
    }
    public int converToString(float f){
        return (int) f;
    }
    public int converToString(double d){
        return (int) d;
    }
    public int converToString(String s){
        return Integer.parseInt(s);
    }
}

