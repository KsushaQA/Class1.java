package homework5.HW2;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree("дуб", 200);
        Tree tree2 = new Tree(300, 20, "Красный");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("сосна");
        System.out.println(tree1.type + " " + tree1.height + " " + tree1.countOfsticks+ " " + tree1.colour);
        System.out.println(tree2.type + " " + tree2.height + " " + tree2.countOfsticks + " " + tree2.colour);
        System.out.println(tree3.type + " " + tree3.height + " " + tree3.countOfsticks + " " + tree3.colour);
        System.out.println(tree4.type + " " + tree4.height + " " + tree4.countOfsticks + " " + tree4.colour);
    }
}
