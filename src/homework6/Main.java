package homework6;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Rock", 5, 75,new String[]{"eat", "drink", "sleep"});
        Human mather = new Human("Jane", "Karleone",1950);
        Human father = new Human("Vito", "Karleone", 1945);
        Human child1 = new Human("Michael", "Karleone", 1977);
        Human child2 = new Human("Michael", "Karleone", 1977);
        Human child3 = new Human("Michael", "Karleone", 1977);
        Human human = new Human("Michael", "Karleone", 1977,90, pet, mather, father);
        Family family1 = new Family(mather, father);
        System.out.println(mather.getName());
        System.out.println(father.getName());
        System.out.println(child1.getName());
        System.out.println(family1.countFamily());
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        System.out.println(family1.countFamily());
        family1.deleteChild(1);
        System.out.println(family1.countFamily());
        System.out.println(pet);
        System.out.println(human);
        pet.respond();
        pet.eat();
        pet.foul();
        human.greetPet();
        human.describePet();

    }
}
