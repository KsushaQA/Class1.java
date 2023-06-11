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
    public String getName(){
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
    public double convertToDouble(byte b){
        return (double) b;
    }
    public double convertToDouble(short s){
        return (double) s;
    }
    public double convertToDouble(int i){
        return (double) i;
    }
    public double convertToDouble(long l){
        return (double) l;
    }
    public double convertToDouble(char c){
        return (double) c;
    }
    public double convertToDouble(float f){
        return (double) f;
    }
    public double convertToDouble(double d){
        return d;
    }
    public double convertToDouble(String s){
        return Double.parseDouble(s);
    }
    public int convertToDouble(boolean b){
        System.out.println("введен тип boolean");
        return 0;
    }
    public int convertToString(byte b){
        return b;
    }
    public int convertToString(short s){
        return s;
    }
    public int convertToString(int i){
        return i;
    }
    public int convertToString(long l){
        return (int) l;
    }
    public int convertToString(char c){
        return c;
    }
    public int convertToString(boolean b){
        return 0;
    }
    public int convertToString(float f){
        return (int) f;
    }
    public int convertToString(double d){
        return (int) d;
    }
    public int convertToString(String s){
        return Integer.parseInt(s);
    }
}

