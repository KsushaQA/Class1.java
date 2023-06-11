package HW1;

public class EqualsClass {
    public static void main(String[] args) {
Computer myPC = new Computer("lenovo", 30000, 16, 4);
Computer myOtherPC = new Computer("lenovo", 25000, 16, 4);
        System.out.println(myPC.equals(myOtherPC));
        System.out.println(myPC.hashCode());
        System.out.println(myOtherPC.hashCode());
    }
}
