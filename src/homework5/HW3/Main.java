package homework5.HW3;

import homework5.HW3.Converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter("Converter");
        int x = converter.convertToInt('f');
        int a = converter.convertToInt(false);
        int b = converter.convertToInt(5);
        int c = converter.convertToInt(4.5);
        int y = converter.convertToInt(5.5f);
        //int v = converter.convertToInt(100b);
        int d = converter.convertToInt(100000000l);
        //int e = converter.convertToInt(10s);
        int w = converter.convertToInt("byte");
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(y);
        //System.out.println(v);
        System.out.println(d);
        //System.out.println(e);
        System.out.println(w);
        double x1 = converter.convertToDouble('f');
        double a1 = converter.convertToDouble(false);
        double b1 = converter.convertToDouble(5);
        double c1 = converter.convertToDouble(4.5);
        double y1 = converter.convertToString(5.5f);
        //double v1 = converter.convertToDouble(100b);
        double d1 = converter.convertToDouble(100000000l);
        //double e1 = converter.convertToDouble(10s);
        double w1 = converter.convertToDouble("byte");
        System.out.println(x1);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(y1);
        //System.out.println(v1);
        System.out.println(d1);
        //System.out.println(e1);
        System.out.println(w1);
        int x2 = converter.convertToString('f');
        int a2 = converter.convertToString(false);
        int b2 = converter.convertToString(5);
        int c2 = converter.convertToString(4.5);
        int y2 = converter.convertToString(5.5f);
        //int v2 = converter.convertToString(100b);
        int d2 = converter.convertToString(100000000l);
        //int e2 = converter.convertToString(10s);
        int w2 = converter.convertToString("byte");
        System.out.println(x2);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(y2);
        //System.out.println(v2);
        System.out.println(d2);
        //System.out.println(e2);
        System.out.println(w2);
    }
}
