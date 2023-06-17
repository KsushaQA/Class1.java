package homework6;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Rock", 5, 75,new String[]{"eat", "drink", "sleep"});
        Human mather = new Human("Jane", "Karleone",1950);
        Human father = new Human("Vito", "Karleone", 1945);
        Human human = new Human("Michael", "Karleone", 1977,90, pet, mather, father);
        System.out.println(pet.toString());
        System.out.println(human.toString());
        pet.respond();
        pet.eat();
        pet.foul();
        human.greetPet();
        human.describePet();

    }

}
