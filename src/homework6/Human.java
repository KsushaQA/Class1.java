package homework6;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    //private Human mother;
    //private Human father;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    /*public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        //this.mother = mother;
        //this.father = father;
    }*/

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        //this.mother = mother;
        //this.father = father;
    }

    public Human() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    //public Human getMother() {
        //return mother;
   // }

    /*public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }*/

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human(Family family) {
        this.family = family;
    }


    public void greetPet() {
        System.out.println("Привіт, " + pet.getNickname() + "!");
    }
    public void describePet() {
        String trickLevel = pet.getTrickLevel() > 50 ? "дуже хитрий" : "майже не хитрий";
        System.out.println("У мене є " + pet.getSpecies() + ", йому " + pet.getAge() + " років, він " + trickLevel + ".");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                //", mother=" + mother.getName() + " " + mother.getSurname() +
                //", father=" + father.getName() + " " + father.getSurname() +
                ", pet=" + pet.toString() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name)
                && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet);
               // && Objects.equals(mother, human.mother) && Objects.equals(father, human.father);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq,pet);// mother, father
    }

}
